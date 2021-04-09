package cn.lvhaosir.design.patterns.singleton.lazy;

/**
 * <p>LazySimpleSingleton</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton(){}

    private static LazySimpleSingleton lazy = null;

    public static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
