package cn.lvhaosir.design.patterns.strategy.pay;


/**
 * <p>PayStrategyTest</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class PayStrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1", "202004151000001", 600);

        System.out.println(order.pay("UnionPay"));
    }

}
