package cn.lvhaosir.design.patterns.observer.events;

/**
 * <p>
 * MouseEventTest
 * </p>
 *
 * @author lvhao
 * @date 2021/5/28
 */
public class MouseEventTest {

    public static void main(String[] args) {
        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();
        mouse.addListener(MouseEventType.ON_CLICK, callback);
        mouse.addListener(MouseEventType.ON_MOVE, callback);
        mouse.addListener(MouseEventType.ON_WHEEL, callback);
        mouse.addListener(MouseEventType.ON_OVER, callback);

        mouse.click();

        mouse.blur();

    }

}
