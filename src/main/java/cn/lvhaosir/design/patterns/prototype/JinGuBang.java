package cn.lvhaosir.design.patterns.prototype;

import java.io.Serializable;

/**
 * <p>Jingubang</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/23
 */
public class JinGuBang implements Serializable {

    public float h = 100;
    public float d = 10;

    public void big() {
        this.h *= 2;
        this.d *= 2;
    }

    public void small() {
        this.h /= 2;
        this.d /= 2;
    }
}
