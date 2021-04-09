package cn.lvhaosir.design.patterns.factory.abstractFactory;

/**
 * <p>BluetoothWatchFactory</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public class BluetoothWatchFactory implements WatchFactory {
    @Override
    public IHeartRate createHeartRate() {
        return new BluetoothWatchHeartRate();
    }

    @Override
    public ISleep createSleep() {
        return new BluetoothWatchSleep();
    }
}
