package cn.lvhaosir.design.patterns.prototype;

/**
 * <p>Client</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/23
 */
public class Client {

    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype prototype) {
        return prototype.clone();
    }
}
