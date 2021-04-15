package cn.lvhaosir.design.patterns.delegate.simple;

/**
 * <p>Boss</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class Boss {

    public void command(String command, Leader leader) {
        leader.doing(command);
    }

}
