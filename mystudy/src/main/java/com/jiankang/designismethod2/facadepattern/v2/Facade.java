package com.jiankang.designismethod2.facadepattern.v2;

/*
 *@create by jiankang
 *@date 2019/11/26 time 15:41
 * 门面模式：
 * 优点：
 * 1】减少了子系统的依赖，所有的依赖就是对门面对象的依赖，与子系统无关
 * 2】提高了灵活性：不管子系统如何变化，只要不影响门面对象，自由活动
 * 3】提高了安全性：门面不开通接口，都无法访问内部
 * 缺点；
 * 1】 不符合开闭原则，对修改关闭，对扩展开放。
 *
 *
 */

public class Facade {
    //被委托的对象
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private Context context = new Context();

    public void methodA() {
        this.a.doSomethingA();
    }

    public void methodB() {
        this.b.doSomethingB();
    }

    public void methodC() {
        this.context.complexMethod();
    }
}
