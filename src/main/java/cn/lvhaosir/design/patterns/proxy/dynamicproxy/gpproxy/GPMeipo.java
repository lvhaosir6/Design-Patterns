package cn.lvhaosir.design.patterns.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.Method;

/**
 * <p>GPMeipo</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/13
 */
public class GPMeipo implements GPInvocationHandler{

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(this.target, args);
        after();
        return null;
    }

    private void before() {
        System.out.println("我是媒婆：我要给你找对象，现在已经拿到需求");
        System.out.println("开始物色");
    }

    private void after() {
        System.out.println("如果合适的话，就准备办事");
    }
}
