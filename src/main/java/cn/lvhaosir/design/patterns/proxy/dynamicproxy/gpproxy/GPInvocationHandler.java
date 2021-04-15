package cn.lvhaosir.design.patterns.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * <p>GPInvocationHandler</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/13
 */
public interface GPInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

}
