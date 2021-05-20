package cn.lvhaosir.design.patterns.adapter.objectadapter;

/**
 * <p>
 * PowerAdapter
 * </p>
 *
 * @author lvhao
 * @date 2021/5/12
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int input = ac220.outputAC220V();
        int output = input / 44;
        System.out.println("使用PowerAdapter输出AC:" + input + "V 输出DC:" + output + "V");
        return 0;
    }
}
