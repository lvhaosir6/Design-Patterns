package cn.lvhaosir.design.patterns.proxy.dbroute;

/**
 * <p>OrderDao</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/13
 */
public class OrderDao {
    public int insert(Order order) {
        System.out.println("OrderDao保存order成功");
        return 1;
    }
}
