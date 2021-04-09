package cn.lvhaosir.design.patterns.factory.methodFactory;

import cn.lvhaosir.design.patterns.factory.simpleFactory.BluetoothWatch;
import cn.lvhaosir.design.patterns.factory.simpleFactory.IWatch;

/**
 * <p>KidWatchFactory</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public class BluetoothWatchFactory implements IWatchFactory {
    @Override
    public IWatch create() {
        return new BluetoothWatch();
    }
}
