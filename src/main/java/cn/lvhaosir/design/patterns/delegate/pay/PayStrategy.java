package cn.lvhaosir.design.patterns.delegate.pay;

import cn.lvhaosir.design.patterns.delegate.pay.payport.*;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>PayStrategy</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class PayStrategy {

    private interface PayKey {
        String ALI_PAY = "AliPay";
        String JD_PAY = "JdPay";
        String UNION_PAY = "UnionPay";
        String WECHAT_PAY = "WechatPay";
        String DEFAULT_PAY = ALI_PAY;
    }

    private static Map<String, Payment> payStrategy = new HashMap<>();
    static {
        payStrategy.put(PayKey.ALI_PAY, new AliPay());
        payStrategy.put(PayKey.JD_PAY, new JdPay());
        payStrategy.put(PayKey.UNION_PAY, new UnionPay());
        payStrategy.put(PayKey.WECHAT_PAY, new WeChatPay());
        payStrategy.put(PayKey.DEFAULT_PAY, new AliPay());
    }

    public static Payment get(String payKey) {
        if (payStrategy.containsKey(payKey) == false) {
            return payStrategy.get(PayKey.DEFAULT_PAY);
        }
        return payStrategy.get(payKey);
    }

}
