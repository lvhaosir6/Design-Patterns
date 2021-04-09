package cn.lvhaosir.design.patterns.singleton.lazy;

/**
 * <p>LazyDoubleCheckSingleton</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton() {}

    private static LazyDoubleCheckSingleton lazy = null;

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }

}
