package cn.lvhaosir.design.patterns.decorator.v2;

/**
 * <p>
 * BaseBattercake
 * </p>
 *
 * @author lvhao
 * @date 2021/5/20
 */
public class BaseBattercake extends Battercake{
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
