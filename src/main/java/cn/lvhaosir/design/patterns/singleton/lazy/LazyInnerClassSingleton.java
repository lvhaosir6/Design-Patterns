package cn.lvhaosir.design.patterns.singleton.lazy;

/**
 * 这种形式兼顾了饿汉式的内存浪费，也兼顾了synchronized性能问题
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton() {}

    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
