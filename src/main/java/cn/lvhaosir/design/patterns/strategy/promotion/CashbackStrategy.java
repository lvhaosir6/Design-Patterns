package cn.lvhaosir.design.patterns.strategy.promotion;

/**
 * <p>CashbackStrategy</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额转到支付宝账户");
    }
}
