package cn.lvhaosir.design.patterns.template.course;

/**
 * <p>NetworkCourseTest</p>
 *
 * @author lvhaosir6
 * @version 1.0.0
 * @date 2021/4/21
 */
public class NetworkCourseTest {
    public static void main(String[] args) {
        NetworkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        NetworkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();
    }

}
