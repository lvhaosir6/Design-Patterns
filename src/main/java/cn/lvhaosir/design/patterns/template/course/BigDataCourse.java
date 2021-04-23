package cn.lvhaosir.design.patterns.template.course;

/**
 * <p>BigDataCourse</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/21
 */
public class BigDataCourse extends NetworkCourse {
    private boolean needHomeworkFlag = false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }

    @Override
    void checkHomework() {
        System.out.println("检查大数据的课后作业");
    }
}
