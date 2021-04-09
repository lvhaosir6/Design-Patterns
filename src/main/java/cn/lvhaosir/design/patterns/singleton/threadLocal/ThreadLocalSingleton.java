package cn.lvhaosir.design.patterns.singleton.threadLocal;

/**
 * <p>ThreadLocalSingleton</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public class ThreadLocalSingleton {
    private ThreadLocalSingleton() {}

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>() {
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
