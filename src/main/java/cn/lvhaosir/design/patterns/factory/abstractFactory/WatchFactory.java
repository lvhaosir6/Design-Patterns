package cn.lvhaosir.design.patterns.factory.abstractFactory;

/**
 * <p>WatchFactory</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public interface WatchFactory {

    IHeartRate createHeartRate();

    ISleep createSleep();
}
