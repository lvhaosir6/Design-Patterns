package cn.lvhaosir.design.patterns.delegate.promotion;

/**
 * <p>GroupbugStrategy</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class GroupbugStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("拼团，满 20 人成团，全团享受团购价");
    }
}
