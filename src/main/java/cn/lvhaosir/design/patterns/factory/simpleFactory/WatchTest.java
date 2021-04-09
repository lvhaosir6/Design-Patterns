package cn.lvhaosir.design.patterns.factory.simpleFactory;

/**
 * <p>WatchTest</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public class WatchTest {
    public static void main(String[] args) {
        IWatch watch = new KidWatch();
        watch.time();

        IWatch bluetoothWatch = new BluetoothWatch();
        bluetoothWatch.time();
    }
}
