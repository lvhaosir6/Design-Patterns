package cn.lvhaosir.design.patterns.decorator.v1;

/**
 * <p>
 * BattercakeTest
 * </p>
 *
 * @author lvhao
 * @date 2021/5/20
 */
public class BattercakeTest {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + " 总价格：" + battercake.getPrice());
        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getMsg() + " 总价格：" + battercakeWithEgg.getPrice());
        Battercake battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getMsg() + " 总价格：" + battercakeWithEggAndSausage.getPrice());
    }

}
