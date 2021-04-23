package cn.lvhaosir.design.patterns.strategy.simple;

/**
 * <p>EMployeeA</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，开始做 " + command);
    }
}
