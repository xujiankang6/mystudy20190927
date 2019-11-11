package com.jiankang.designismethod2.templatemethod.v3;

/*
 *@create by jiankang
 *@date 2019/11/11 time 11:38
 */

/*
定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改
变一个算法的结构即可重定义该算法的某些特定步骤
 */
public abstract class HummerModel {
    /*
     * 首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正
     * 是要能够发动起来，那这个实现要在实现类里了
     */
    protected abstract void start();

    //能发动，还要能停下来，那才是真本事
    protected abstract void stop();

    //喇叭会出声音，是滴滴叫，还是哔哔叫
    protected abstract void alarm();

    //引擎会轰隆隆地响，不响那是假的
    protected abstract void engineBoom();



    //那模型应该会跑吧，别管是人推的，还是电力驱动的，总之要会跑
    final public void run() {
        this.start();
        this.engineBoom();
        //要让它叫就叫，不让他叫就不叫
        if(this.isAlarm()){
            this.alarm();
        }

        this.stop();
    }

    //钩子方法，默认喇叭会响的
    protected boolean isAlarm(){
        return true;
    }

}
