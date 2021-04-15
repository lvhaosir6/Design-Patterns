package cn.lvhaosir.design.patterns.proxy.dbroute;

/**
 * <p>Order</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/13
 */
public class Order {

    private String id;
    private Object orderInfo;
    private Long createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
