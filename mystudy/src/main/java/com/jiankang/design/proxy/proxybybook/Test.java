package com.jiankang.design.proxy.proxybybook;

import com.jiankang.design.proxy.IOrderService;
import com.jiankang.design.proxy.Order;
import com.jiankang.design.proxy.OrderServiceImpl;
import com.jiankang.design.proxy.proxybybook.OrderServiceDynamicProxy;

public class Test {

    public static void main(String[] args) {
        Order order=new Order();
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy= (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);

    }
}
