package cn.lvhaosir.design.patterns.adapter.loginadapter;

/**
 * <p>
 * SignInForThirdService
 * </p>
 *
 * @author lvhao
 * @date 2021/5/12
 */
public class SignInForThirdService extends SignInService {
    public R loginForQQ(String openId) {
        return null;
    }

    public R loginForWechat(String openId) {
        return null;
    }

    public R loginForToken(String token) {
        return null;
    }

    public R loginForRegist(String username, String password) {
        super.regist(username, password);
        return super.login(username, password);
    }

}
