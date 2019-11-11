package com.jiankang.designismethod2.factorymethod.v5;

/*
 *@create by jiankang
 *@date 2019/11/2 time 21:10
 */

public class ConcreteBigFactory extends  BigFactory{
    @Override
    public <T extends AbstractHumanFactory> T createHumanFactory(Class<T> c) {
        AbstractHumanFactory humanFactory=null;
        try {
            humanFactory = (AbstractHumanFactory) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T) humanFactory;
    }
}
