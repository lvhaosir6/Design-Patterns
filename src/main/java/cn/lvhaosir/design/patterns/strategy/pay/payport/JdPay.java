package cn.lvhaosir.design.patterns.strategy.pay.payport;

/**
 * <p>JdPay</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class JdPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    public double queryBalance(String uid) {
        return 500;
    }
}
