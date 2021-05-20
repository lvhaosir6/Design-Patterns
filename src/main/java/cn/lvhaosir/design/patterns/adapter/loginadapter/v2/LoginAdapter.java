package cn.lvhaosir.design.patterns.adapter.loginadapter.v2;

import cn.lvhaosir.design.patterns.adapter.loginadapter.R;

/**
 * <p>
 * LoginAdapter
 * </p>
 *
 * @author lvhao
 * @date 2021/5/15
 */
public interface LoginAdapter {

    boolean support(Object adapter);

    R login(String id, Object adapter);

}
