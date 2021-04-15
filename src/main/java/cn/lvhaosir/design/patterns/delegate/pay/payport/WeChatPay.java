package cn.lvhaosir.design.patterns.delegate.pay.payport;

/**
 * <p>WeChatPay</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class WeChatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    public double queryBalance(String uid) {
        return 250;
    }
}
