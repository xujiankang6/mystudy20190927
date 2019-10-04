package com.jiankang.design.proxy;

public class OrderServiceImpl implements IOrderService {

    private IOrderDao orderDao=new OrderDaoImpl();

    @Override
    public int saveOrder(Order order) {

        System.out.println("service调用插入order");
        return orderDao.insertOrder(order);
    }
}
