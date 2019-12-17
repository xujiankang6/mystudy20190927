package com.jiankang.designismethod2.factorymethod.v3;

/*
 *@create by jiankang
 *@date 2019/11/3 time 12:16
 */

import com.jiankang.designismethod2.factorymethod.v2.ConcreteProduct1;
import com.jiankang.designismethod2.factorymethod.v2.ConcreteProduct2;
import com.jiankang.designismethod2.factorymethod.v2.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private static final Map<String , Product> prMap = new HashMap<>();

    public static  synchronized Product createProduct(String type) throws Exception{
        Product product=null;
        if (prMap.containsKey(type)) {
            product=prMap.get(type);
        }else{
            if(type.equals("Product1")){
                product = new ConcreteProduct1();
            }else{
                product = new ConcreteProduct2();
            }
            prMap.put(type,product);
        }
        return product;
    }
}
