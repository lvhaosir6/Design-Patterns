package cn.lvhaosir.design.patterns.proxy.staticproxy;

/**
 * <p>Father</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/13
 */
public class Father {

    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void findLove() {
        System.out.println("父母物色对象");
        son.findLove();
        System.out.println("双方同意交往，确立关系");
    }
}
