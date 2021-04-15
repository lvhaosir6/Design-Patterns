package cn.lvhaosir.design.patterns.factory.methodFactory;

/**
 * <p>FactoryMethodTest</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public class FactoryMethodTest {
    public static void main(String[] args) {

        IWatchFactory kidWatchFactory = new KidWatchFactory();
        kidWatchFactory.create().time();

        IWatchFactory bluetoothWatchFactory = new BluetoothWatchFactory();
        bluetoothWatchFactory.create().time();

    }
}
