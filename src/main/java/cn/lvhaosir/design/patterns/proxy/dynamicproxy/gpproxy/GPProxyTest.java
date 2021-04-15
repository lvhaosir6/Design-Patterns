package cn.lvhaosir.design.patterns.proxy.dynamicproxy.gpproxy;

import cn.lvhaosir.design.patterns.proxy.dynamicproxy.gpproxy.GPMeipo;
import cn.lvhaosir.design.patterns.proxy.dynamicproxy.jdkproxy.Customer;
import cn.lvhaosir.design.patterns.proxy.staticproxy.Person;

/**
 * <p>GPProxyTest</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/13
 */
public class GPProxyTest {

    public static void main(String[] args) {
        Person obj = (Person) new GPMeipo().getInstance(new Customer());
        System.out.println(obj.getClass());
        obj.findLove();
    }

}
