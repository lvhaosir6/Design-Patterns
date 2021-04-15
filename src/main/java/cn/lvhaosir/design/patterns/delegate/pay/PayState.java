package cn.lvhaosir.design.patterns.delegate.pay;

/**
 * <p>PayState</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class PayState {

    private int code;
    private String msg;
    private Object data;

    public PayState(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "[支付状态<" + code + "> 消息<" + msg + "> 详情<" + data + ">]";
    }
}
