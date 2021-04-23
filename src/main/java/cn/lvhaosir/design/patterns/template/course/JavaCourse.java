package cn.lvhaosir.design.patterns.template.course;

/**
 * <p>JavaCourse</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/21
 */
public class JavaCourse extends NetworkCourse {
    @Override
    void checkHomework() {
        System.out.println("检查Java的课后作业");
    }
}
