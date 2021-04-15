package cn.lvhaosir.design.patterns.proxy.dynamicproxy.jdkproxy;

import cn.lvhaosir.design.patterns.proxy.dynamicproxy.jdkproxy.Customer;
import cn.lvhaosir.design.patterns.proxy.dynamicproxy.jdkproxy.JDKMeipo;
import cn.lvhaosir.design.patterns.proxy.staticproxy.Person;

/**
 * <p>DynamicProxyTest</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/13
 */
public class DynamicProxyTest {

    public static void main(String[] args) {

        Person obj = (Person) new JDKMeipo().getInstance(new Customer());
        obj.findLove();
    }

}
