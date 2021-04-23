package cn.lvhaosir.design.patterns.strategy.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Leader</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/15
 */
public class Leader implements IEmployee {

    private Map<String, IEmployee> targets = new HashMap<String, IEmployee>();

    public Leader() {
        targets.put("加密", new EmployeeA());
        targets.put("登录", new EmployeeB());
    }

    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
