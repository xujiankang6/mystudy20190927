package com.jiankang.javaprogramminglogic.chapter24.v3;

/*
 *@create by jiankang
 *@date 2020/5/23 time 14:15
 */

public class MyClassLoader extends ClassLoader {
    private static final String BASE_DIR = "com.jiankang.javaprogramminglogic.chapter24.v3.";


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String fileName = name.replaceAll("\\.", "/");
        fileName = BASE_DIR + fileName + ".class";
        try {
            byte[] bytes = BinaryFileUtils.readFileToByteArray(fileName);
            return defineClass(name, bytes, 0, bytes.length);
        } catch (Exception ex) {
            throw new ClassNotFoundException("failed to load class " + name, ex);
        }
    }
}
