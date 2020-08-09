package tacos.data;

/*
 *@create by jiankang
 *@date 2020/8/7 time 18:20
 */

import tacos.Order;

public interface OrderRepository {
    Order save(Order order);
}
