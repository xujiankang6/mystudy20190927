package com.jiankang.design.proxy.staticproxy;

import com.jiankang.design.proxy.IOrderService;
import com.jiankang.design.proxy.Order;
import com.jiankang.design.proxy.OrderServiceImpl;

public class OrderServiceStaticProxy {

    private IOrderService orderService;


    public int saveOrder(Order order) {
        beforeMethod(order);
        orderService = new OrderServiceImpl();
        int result = orderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        System.out.println("静态代理before code");
        int orderId = order.getUserId();
        int dbRouter = orderId % 2;
        System.out.println("静态代理分配到【" + dbRouter + "】处理数据");
    }

    private void afterMethod() {
        System.out.println("静态代理after code");
    }
}
