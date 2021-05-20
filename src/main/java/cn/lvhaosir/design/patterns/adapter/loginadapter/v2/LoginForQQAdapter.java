package cn.lvhaosir.design.patterns.adapter.loginadapter.v2;

import cn.lvhaosir.design.patterns.adapter.loginadapter.R;

/**
 * <p>
 * LoginForQQAdapter
 * </p>
 *
 * @author lvhao
 * @date 2021/5/15
 */
public class LoginForQQAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public R login(String id, Object adapter) {
        return null;
    }
}
