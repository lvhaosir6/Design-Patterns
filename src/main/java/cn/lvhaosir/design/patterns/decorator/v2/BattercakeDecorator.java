package cn.lvhaosir.design.patterns.decorator.v2;

/**
 * <p>
 * BattercakeDecorator
 * </p>
 *
 * @author lvhao
 * @date 2021/5/20
 */
public abstract class BattercakeDecorator extends Battercake {

    // 静态代理，委派
    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected abstract void doSomething();


    @Override
    protected String getMsg() {
        return battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return battercake.getPrice();
    }
}
