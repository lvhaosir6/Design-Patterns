package cn.lvhaosir.design.patterns.proxy.dynamicproxy.cglibproxy;

import cn.lvhaosir.design.patterns.proxy.dynamicproxy.cglibproxy.CglibMeipo;
import cn.lvhaosir.design.patterns.proxy.dynamicproxy.jdkproxy.Customer;

/**
 * <p>CglibTest</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/13
 */
public class CglibTest {

    public static void main(String[] args) {
        Customer obj = (Customer) new CglibMeipo().getInstance(Customer.class);
        obj.findLove();
    }

}
