package cn.lvhaosir.design.patterns.delegate.pay.payport;

/**
 * <p>AliPay</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double queryBalance(String uid) {
        return 1000;
    }
}
