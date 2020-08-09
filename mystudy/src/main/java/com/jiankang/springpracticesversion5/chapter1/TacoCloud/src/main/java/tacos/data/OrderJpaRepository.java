package tacos.data;

/*
 *@create by jiankang
 *@date 2020/8/7 time 18:20
 */

//import org.springframework.data.repository.CrudRepository;
import tacos.Order;

import java.util.Date;
import java.util.List;


public interface OrderJpaRepository
//        extends CrudRepository<Order,Long>
{

    List<Order> findByDeliveryZip(String diliveryZip);

    List<Order> readOrdersByDeliveryZipAndPlacedAtBetween(String diliveryZip, Date startDate,Date endDate);
}
