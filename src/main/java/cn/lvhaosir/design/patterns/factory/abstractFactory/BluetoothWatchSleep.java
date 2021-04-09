package cn.lvhaosir.design.patterns.factory.abstractFactory;

/**
 * <p>BluetoothWatchSleep</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public class BluetoothWatchSleep implements ISleep {
    @Override
    public void test() {
        System.out.println("蓝牙手表测试睡眠");
    }
}
