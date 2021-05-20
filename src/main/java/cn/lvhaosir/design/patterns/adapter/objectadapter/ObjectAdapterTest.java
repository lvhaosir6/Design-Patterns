package cn.lvhaosir.design.patterns.adapter.objectadapter;

/**
 * <p>
 * ObjectAdapterTest
 * </p>
 *
 * @author lvhao
 * @date 2021/5/12
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }
}
