package cn.lvhaosir.design.patterns.factory.abstractFactory;

/**
 * <p>AbstractFactoryTest</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {

        WatchFactory factory = new BluetoothWatchFactory();
        factory.createHeartRate().test();
        factory.createSleep().test();

    }
}
