package cn.lvhaosir.design.patterns.singleton.enumSingleton;

/**
 * <p>EnumSignleton</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public enum  EnumSignleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSignleton getInstance() {
        return INSTANCE;
    }
}
