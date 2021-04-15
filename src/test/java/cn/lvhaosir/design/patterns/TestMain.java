package cn.lvhaosir.design.patterns;

import org.junit.Test;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * <p>Test</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/14
 */
public class TestMain {

    @Test
    public void test() {
        Object obj = new Object();
        SoftReference sf = new SoftReference<Object>(obj);
        Object o = sf.get();
        obj = null;
        System.gc();
        byte[] bytes = new byte[1024 * 100];
        System.gc();
        System.out.println("是否被回收"+sf.get());
        WeakReference wr = new WeakReference(obj);
        Object o1 = wr.get();
    }

}
