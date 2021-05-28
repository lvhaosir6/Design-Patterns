package cn.lvhaosir.design.patterns.observer.gperadvice;

/**
 * <p>
 * ObserverTest
 * </p>
 *
 * @author lvhao
 * @date 2021/5/27
 */
public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");

        gper.addObserver(tom);
        gper.addObserver(mic);

        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于哪些场景？");

        gper.publishQuestion(question);
    }

}
