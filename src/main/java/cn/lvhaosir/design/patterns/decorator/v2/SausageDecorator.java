package cn.lvhaosir.design.patterns.decorator.v2;

/**
 * <p>
 * SausageDecorator
 * </p>
 *
 * @author lvhao
 * @date 2021/5/20
 */
public class SausageDecorator extends BattercakeDecorator{
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected void doSomething() {

    }


    @Override
    protected String getMsg() {
        return super.getMsg() + " + 一根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
