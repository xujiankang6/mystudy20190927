package com.jiankang.design.proxy.staticproxy;

import com.jiankang.design.proxy.IOrderService;
import com.jiankang.design.proxy.Order;
import com.jiankang.design.proxy.OrderServiceImpl;

public class OrderServiceStaticProxy {

    private IOrderService orderService;


    public int saveOrder(Order order){
        beforeMethod();
        orderService=new OrderServiceImpl();
        int orderId=order.getUserId();
        int dbRouter=orderId%2;
        System.out.println("静态代理分配到【"+dbRouter+"】处理数据");
        afterMethod();

        return orderService.saveOrder(order);
    }

    private void beforeMethod(){
        System.out.println("静态代理before code");
    }
    private void afterMethod(){
        System.out.println("静态代理after code");
    }
}
