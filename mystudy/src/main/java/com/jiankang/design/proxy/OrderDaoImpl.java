package com.jiankang.design.proxy;

public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insertOrder(Order order) {
        System.out.println(

                "insert one record"
        );
        return 1;
    }
}
