package cn.lvhaosir.design.patterns.adapter.loginadapter;

/**
 * <p>
 * SignInForThirdServiceTest
 * </p>
 *
 * @author lvhao
 * @date 2021/5/15
 */
public class SignInForThirdServiceTest {
    public static void main(String[] args) {
        SignInForThirdService service = new SignInForThirdService();
        service.loginForQQ("88457887");
    }

}
