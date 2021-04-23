package cn.lvhaosir.design.patterns.prototype;

import java.util.List;

/**
 * <p>ConcretePrototypeA</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/23
 */
public class ConcretePrototypeA implements Prototype {

    private int age;
    private String name;
    private List<String> hobbies;

    @Override
    public Prototype clone() {
        ConcretePrototypeA a = new ConcretePrototypeA();
        a.setAge(this.age);
        a.setName(this.name);
        a.setHobbies(this.hobbies);
        return a;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
