package cn.lvhaosir.design.patterns.factory.simpleFactory;

/**
 * <p>KidWatch</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/9
 */
public class KidWatch implements IWatch {
    @Override
    public void time() {
        System.out.println("儿童手表看时间");
    }
}
