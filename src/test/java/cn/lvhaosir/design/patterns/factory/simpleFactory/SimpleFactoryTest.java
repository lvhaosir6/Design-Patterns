package cn.lvhaosir.design.patterns.factory.simpleFactory;

/**
 * <p>SimpleFactoryTest</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        WatchFactory.create("kidWatch").time();
        WatchFactory.create("bluetoothWatch").time();

        WatchFactory.create(KidWatch.class).time();
        WatchFactory.create(BluetoothWatch.class).time();
    }
}
