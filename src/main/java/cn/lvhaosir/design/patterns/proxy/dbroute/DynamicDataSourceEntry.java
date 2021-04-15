package cn.lvhaosir.design.patterns.proxy.dbroute;

/**
 * <p>DynamicDataSourceEntry</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/13
 */
public class DynamicDataSourceEntry {

    public final static String DEFAULT_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSourceEntry() {
    }

    public static void set(int year) {
        local.set("DB_" + year);
    }

    public static void set(String source) {
        local.set(source);
    }

    public static void clear() {
        local.remove();
    }

    public static void restore() {
        local.set(DEFAULT_SOURCE);
    }

    public static String get() {
        return local.get();
    }

}
