package cn.lvhaosir.design.patterns.delegate.pay.payport;

import cn.lvhaosir.design.patterns.delegate.pay.PayState;

/**
 * <p>Payment</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public abstract class Payment {

    public abstract String getName();

    public abstract double queryBalance(String uid);

    public PayState pay(String uid, double amout) {
        if (queryBalance(uid) < amout) {
            return new PayState(500, "支付失败", "余额不足");
        }
        return new PayState(200, "支付成功", "支付金额<" + amout + ">");
    }


}
