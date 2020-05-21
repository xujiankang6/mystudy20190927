package com.jiankang.javaprogramminglogic.chapter23.v4;

/*
 *@create by jiankang
 *@date 2020/5/21 time 17:29
 */

import com.jiankang.javaprogramminglogic.chapter22.v4.SimpleInject;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;


public class CGLibContainer {

    static Map<Class<?>, Map<InterceptPoint, List<Method>>> interceptMethodsMap = new HashMap<>();

    static Class<?>[] aspects = new Class<?>[]{
            ServiceLogAspect.class, ExceptionAspect.class
    };

    static {
        init();
    }


    private static void init() {
        for (Class<?> cls : aspects) {
            Aspect aspect = cls.getAnnotation(Aspect.class);
            if (aspect != null) {
                Method before = getMethod(cls, "before", new Class<?>[]{Object.class, Method.class, Object[].class});
                Method after = getMethod(cls, "after", new Class<?>[]{Object.class, Method.class, Object[].class, Object.class});
                Method exception = getMethod(cls, "exception", new Class<?>[]{Object.class, Method.class, Object[].class, Throwable.class});

                Class<?>[] intercepttedArr = aspect.value();
                for (Class<?> intceptted : intercepttedArr) {
                    addInterceptMethod(intceptted, InterceptPoint.BEFORE, before);
                    addInterceptMethod(intceptted, InterceptPoint.AFTER, after);
                    addInterceptMethod(intceptted, InterceptPoint.EXCEPTION, exception);
                }
            }
        }

    }

    static List<Method> getInterceptMethods(Class<?> cls, InterceptPoint point) {
        Map<InterceptPoint, List<Method>> map = interceptMethodsMap.get(cls);
        if (map == null) {
            return Collections.emptyList();
        }
        List<Method> methods = map.get(point);
        if (methods == null) {
            return Collections.emptyList();
        }
        return methods;
    }

    private static void addInterceptMethod(Class<?> cls, InterceptPoint point, Method method) {
        if (method == null) {
            return;
        }
        Map<InterceptPoint, List<Method>> map = interceptMethodsMap.get(cls);
        if (map == null) {
            map = new HashMap<>();
            interceptMethodsMap.put(cls, map);
        }
        List<Method> methods = map.get(point);
        if (methods == null) {
            methods = new ArrayList<>();
            map.put(point, methods);
        }
        methods.add(method);
    }


    private static Method getMethod(Class<?> cls, String name, Class<?>[] paramTypes) {
        try {
            return cls.getMethod(name, paramTypes);
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    static class AspectInterceptor implements MethodInterceptor {

        @Override
        public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {
            //执行before方法
            List<Method> beforeMethods = getInterceptMethods(object.getClass().getSuperclass(), InterceptPoint.BEFORE);
            for (Method beforeMethod : beforeMethods) {
                beforeMethod.invoke(null, object, method, args);
            }
            try {
                Object result = proxy.invokeSuper(object, args);
                //执行after方法
                List<Method> afterMethods = getInterceptMethods(object.getClass().getSuperclass(), InterceptPoint.AFTER);
                for (Method afterMethod : afterMethods) {
                    afterMethod.invoke(null, object, method, args, result);
                }
                return result;
            } catch (Exception e) {
                //执行exception方法
                List<Method> exectionMethods = getInterceptMethods(object.getClass().getSuperclass(), InterceptPoint.EXCEPTION);
                for (Method exectionMethod : exectionMethods) {
                    exectionMethod.invoke(null, object, method, args, e);
                }
                throw e;
            }
        }
    }

    private static <T> T createInstance(Class<T> cls) throws IllegalAccessException, InstantiationException {
        if (!interceptMethodsMap.containsKey(cls)) {
            return (T) cls.newInstance();
        }
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cls);
        enhancer.setCallback(new AspectInterceptor());
        return (T) enhancer.create();
    }



    public static <T> T getInstance(Class<T> cls) {
        try {
            T obj = createInstance(cls);
            Field[] fields = cls.getDeclaredFields();
            for (Field f : fields) {
                if (f.isAnnotationPresent(SimpleInject.class)) {
                    if (!f.isAccessible()) {
                        f.setAccessible(true);
                    }
                    Class<?> fieldCls = f.getType();
                    f.set(obj, getInstance(fieldCls));
                }
            }
            return obj;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        ServiceA instance = CGLibContainer.getInstance(ServiceA.class);
        instance.callB();
    }
}
