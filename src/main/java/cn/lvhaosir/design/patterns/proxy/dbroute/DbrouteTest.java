package cn.lvhaosir.design.patterns.proxy.dbroute;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>DbrouteTest</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/13
 */
public class DbrouteTest {

    public static void main(String[] args) {

        try {
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2020/02/01");
            order.setCreateTime(date.getTime());
            IOrderService orderService = new OrderServiceStaticProxy(new OrderService(new OrderDao()));
            orderService.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
