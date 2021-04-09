package cn.lvhaosir.design.patterns.factory.methodFactory;

import cn.lvhaosir.design.patterns.factory.simpleFactory.IWatch;
import cn.lvhaosir.design.patterns.factory.simpleFactory.KidWatch;

/**
 * <p>KidWatchFactory</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public class KidWatchFactory implements IWatchFactory {
    @Override
    public IWatch create() {
        return new KidWatch();
    }
}
