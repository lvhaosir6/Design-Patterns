package cn.lvhaosir.design.patterns.singleton.hunger;

/**
 * <p>Hunger</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public class HungerSingleton {

    private static final HungerSingleton hungerSingleton = new HungerSingleton();

    private HungerSingleton(){}

    public static HungerSingleton getInstance() {
        return hungerSingleton;
    }

}
