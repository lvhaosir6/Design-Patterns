package cn.lvhaosir.design.patterns.adapter.loginadapter.v2;

import cn.lvhaosir.design.patterns.adapter.loginadapter.R;

/**
 * <p>
 * LoginForSinaAdapter
 * </p>
 *
 * @author lvhao
 * @date 2021/5/15
 */
public class LoginForSinaAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    @Override
    public R login(String id, Object adapter) {
        return null;
    }
}
