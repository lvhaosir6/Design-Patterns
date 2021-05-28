package cn.lvhaosir.design.patterns.decorator.v2;

/**
 * <p>
 * EggDecorator
 * </p>
 *
 * @author lvhao
 * @date 2021/5/20
 */
public class EggDecorator extends BattercakeDecorator {


    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + " + 一个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
