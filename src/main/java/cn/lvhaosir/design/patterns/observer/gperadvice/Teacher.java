package cn.lvhaosir.design.patterns.observer.gperadvice;

import java.util.Observable;
import java.util.Observer;

/**
 * <p>
 * Teacher
 * </p>
 *
 * @author lvhao
 * @date 2021/5/27
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gper = (GPer) o;
        Question question = (Question) arg;
        System.out.println("============================");
        System.out.println(name + "老师，你好！");
        System.out.println("您收到了一个来自 " + gper.getName() + " 的提问，希望您解答，问题内容如下：");
        System.out.println(question.getContent());
        System.out.println("提问者：" + question.getUserName());
    }
}
