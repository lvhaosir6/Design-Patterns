package cn.lvhaosir.design.patterns.proxy.dynamicproxy.jdkproxy;

import cn.lvhaosir.design.patterns.proxy.staticproxy.Person;

/**
 * <p>Customer</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/13
 */
public class Customer implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅、无敌颜值");
    }
}
