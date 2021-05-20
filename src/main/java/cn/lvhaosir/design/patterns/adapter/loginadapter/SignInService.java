package cn.lvhaosir.design.patterns.adapter.loginadapter;

/**
 * <p>
 * SignInService
 * </p>
 *
 * @author lvhao
 * @date 2021/5/12
 */
public class SignInService {

    public R regist(String username, String password) {
        return new R(200, "注册成功", null);
    }

    public R login(String username, String password) {
        return null;
    }


}
