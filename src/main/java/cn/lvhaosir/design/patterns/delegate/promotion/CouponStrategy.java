package cn.lvhaosir.design.patterns.delegate.promotion;

/**
 * <p>CouponStrategy</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，课程的价格直降减优惠券面值抵扣");
    }
}
