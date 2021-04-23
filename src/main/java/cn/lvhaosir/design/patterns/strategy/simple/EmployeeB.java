package cn.lvhaosir.design.patterns.strategy.simple;

/**
 * <p>EmployeeB</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，开始做 " + command);
    }
}
