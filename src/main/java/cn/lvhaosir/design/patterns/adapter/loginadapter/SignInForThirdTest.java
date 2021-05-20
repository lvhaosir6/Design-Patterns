package cn.lvhaosir.design.patterns.adapter.loginadapter;

import cn.lvhaosir.design.patterns.adapter.loginadapter.v2.ILoginForThird;
import cn.lvhaosir.design.patterns.adapter.loginadapter.v2.LoginForThirdAdapter;

/**
 * <p>
 * SignInForThirdTest
 * </p>
 *
 * @author lvhao
 * @date 2021/5/20
 */
public class SignInForThirdTest {
    public static void main(String[] args) {
        ILoginForThird loginForThird = new LoginForThirdAdapter();
        loginForThird.loginForQQ("821387428734");
    }
}
