package cn.lvhaosir.design.patterns.delegate.simple;

/**
 * <p>SimpleDelegateTest</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class SimpleDelegateTest {

    public static void main(String[] args) {
        new Boss().command("登录", new Leader());
    }

}
