package cn.lvhaosir.design.patterns.strategy.pay;

import cn.lvhaosir.design.patterns.strategy.pay.payport.Payment;

/**
 * <p>Order</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class Order {
    private String uid;
    private String orderId;
    private double amout;

    public Order(String uid, String orderId, double amout) {
        this.uid = uid;
        this.orderId = orderId;
        this.amout = amout;
    }

    public PayState pay(String payKey) {
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用<"+ payment.getName() + ">");
        System.out.println("本次交易金额为<"+amout+">，开始扣款...");
        return payment.pay(uid, amout);
    }
}
