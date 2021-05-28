package cn.lvhaosir.design.patterns.decorator.v1;

/**
 * <p>
 * BattercakeWithEggAndSausage
 * </p>
 *
 * @author lvhao
 * @date 2021/5/20
 */
public class BattercakeWithEggAndSausage extends BattercakeWithEgg {

    @Override
    protected String getMsg() {
        return super.getMsg() + " + 一根香肠";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
