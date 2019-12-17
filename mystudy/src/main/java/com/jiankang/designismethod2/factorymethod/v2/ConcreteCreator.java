package com.jiankang.designismethod2.factorymethod.v2;

/*
 *@create by jiankang
 *@date 2019/11/2 time 20:34
 */

public class ConcreteCreator extends  Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product=null;
        try {
            product= (Product) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T) product;
    }
}
