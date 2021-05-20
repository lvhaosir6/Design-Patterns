package cn.lvhaosir.design.patterns.adapter.loginadapter.v2;

import cn.lvhaosir.design.patterns.adapter.loginadapter.R;

/**
 * <p>
 * ILoginForThird
 * </p>
 *
 * @author lvhao
 * @date 2021/5/20
 */
public interface ILoginForThird {

    R loginForQQ(String id);

    R loginForSina(String id);

}
