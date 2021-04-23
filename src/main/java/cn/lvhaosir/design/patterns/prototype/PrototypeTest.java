package cn.lvhaosir.design.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>PrototypeTest</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/23
 */
public class PrototypeTest {

    public static void main(String[] args) {
        ConcretePrototypeA prototypeA = new ConcretePrototypeA();
        prototypeA.setAge(18);
        prototypeA.setName("prototype");
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Java");
        prototypeA.setHobbies(hobbies);
        System.out.println(prototypeA);

        Client client = new Client(prototypeA);
        ConcretePrototypeA prototypeClone = (ConcretePrototypeA) client.startClone(prototypeA);
        System.out.println(prototypeClone);

        System.out.println("克隆对象中的引用类型地址值："+ prototypeClone.getHobbies());
        System.out.println("原对象中的引用类型地址值："+ prototypeA.getHobbies());
        System.out.println("对象地址比较："+ (prototypeClone.getHobbies() == prototypeA.getHobbies()));

    }

}
