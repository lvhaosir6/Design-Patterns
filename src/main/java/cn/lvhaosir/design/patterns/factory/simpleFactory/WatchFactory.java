package cn.lvhaosir.design.patterns.factory.simpleFactory;

/**
 * <p>WatchFactory</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public class WatchFactory {
    /**
     * 根据名称创建
     * @param name
     * @return
     */
    public static IWatch create(String name) {
        if ("kidWatch".equals(name)) {
            return new KidWatch();
        } else if ("bluetoothWatch".equals(name)) {
            return new BluetoothWatch();
        } else {
            return null;
        }
    }

    public static IWatch create(Class<? extends IWatch> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
