package cn.lvhaosir.design.patterns.adapter.loginadapter.v2;

import cn.lvhaosir.design.patterns.adapter.loginadapter.R;
import cn.lvhaosir.design.patterns.adapter.loginadapter.SignInService;

/**
 * <p>
 * LoginForThirdAdapter
 * </p>
 *
 * @author lvhao
 * @date 2021/5/20
 */
public class LoginForThirdAdapter extends SignInService implements ILoginForThird {
    @Override
    public R loginForQQ(String id) {
        return processLogin(id, LoginForQQAdapter.class);
    }

    @Override
    public R loginForSina(String id) {
        return processLogin(id, LoginForSinaAdapter.class);
    }

    private R processLogin(String key, Class<? extends LoginAdapter> clazz) {
        LoginAdapter adapter = null;
        try {
            adapter = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        if (adapter.support(adapter)) {
            return adapter.login(key, adapter);
        }
        return null;
    }


}
