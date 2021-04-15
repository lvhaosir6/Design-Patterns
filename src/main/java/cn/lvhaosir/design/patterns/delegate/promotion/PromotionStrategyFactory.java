package cn.lvhaosir.design.patterns.delegate.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>PromotionStrategyFactory</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class PromotionStrategyFactory {

    private PromotionStrategyFactory() {}

    private interface PromotionKey {
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUG = "GROUPBUG";
        String EMPTY = "EMPTY";
    }

    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON, new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK, new CashbackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUG, new GroupbugStrategy());
    }

    private static final PromotionStrategy NONE_PROMOTION = new EmptyStrategy();

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NONE_PROMOTION: promotionStrategy;
    }


}
