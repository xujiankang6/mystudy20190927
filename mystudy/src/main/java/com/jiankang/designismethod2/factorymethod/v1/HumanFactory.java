package com.jiankang.designismethod2.factorymethod.v1;

/*
 *@create by jiankang
 *@date 2019/11/2 time 19:57
 */

public class HumanFactory extends AbstractHumanFactory {


    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            //产生一个人种
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return (T) human;
    }
}
