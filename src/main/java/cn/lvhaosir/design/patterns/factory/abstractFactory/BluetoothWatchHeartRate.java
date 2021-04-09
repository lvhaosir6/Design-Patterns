package cn.lvhaosir.design.patterns.factory.abstractFactory;

/**
 * <p>BluetoothWatchHeartRate</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public class BluetoothWatchHeartRate implements IHeartRate {
    @Override
    public void test() {
        System.out.println("蓝牙设备测试心率");
    }
}
