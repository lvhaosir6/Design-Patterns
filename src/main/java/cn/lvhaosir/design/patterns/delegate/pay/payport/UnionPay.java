package cn.lvhaosir.design.patterns.delegate.pay.payport;

/**
 * <p>UnionPay</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    public double queryBalance(String uid) {
        return 500;
    }
}
