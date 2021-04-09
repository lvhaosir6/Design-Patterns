package cn.lvhaosir.design.patterns.factory.simpleFactory;

/**
 * <p>BluetoothWatch</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public class BluetoothWatch implements IWatch {
    @Override
    public void time() {
        System.out.println("蓝牙手表看时间");
    }
}
