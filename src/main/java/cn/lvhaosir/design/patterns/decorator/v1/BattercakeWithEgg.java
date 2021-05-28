package cn.lvhaosir.design.patterns.decorator.v1;

/**
 * <p>
 * BattercakeWithEgg
 * </p>
 *
 * @author lvhao
 * @date 2021/5/20
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    protected String getMsg() {
        return super.getMsg() + " + 一个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
