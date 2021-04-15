package cn.lvhaosir.design.patterns.delegate.promotion;

/**
 * <p>PromotionStrategyTest</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class PromotionStrategyTest {

    /*public static void main(String[] args) {
        PromotionActivity promotionActivity = new PromotionActivity(new CashbackStrategy());
        promotionActivity.execute();

        PromotionActivity promotionActivity1 = new PromotionActivity(new EmptyStrategy());
        promotionActivity1.execute();
    }*/

    /*public static void main(String[] args) {
        PromotionActivity promotionActivity = null;
        String promotionKey = "EMPTY";
        if ("COUPON".equals(promotionKey)) {
            promotionActivity = new PromotionActivity(new CouponStrategy());
        } else if ("CASHBACK".equals(promotionKey)) {
            promotionActivity = new PromotionActivity(new CashbackStrategy());
        } else {
            promotionActivity = new PromotionActivity(new EmptyStrategy());
        }
        promotionActivity.execute();
    }*/

    public static void main(String[] args) {
        String promotionKey = "GROUPBUG";
        new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey)).execute();
    }

}
