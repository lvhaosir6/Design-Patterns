package cn.lvhaosir.design.patterns.observer.events;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * EventLisenter
 * </p>
 *
 * @author lvhao
 * @date 2021/5/27
 */
public class EventListener {

    protected Map<String, Event> events = new HashMap<>();

    public void addListener(String eventType, Object target) {
        try {
            this.addListener(eventType, target, target.getClass().getMethod("on" + toUpperFirstCase(eventType), Event.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public void addListener(String eventType, Object target, Method callback) {
        events.put(eventType, new Event(target, callback));
    }

    private String toUpperFirstCase(String str) {
        char[] chars = str.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }

    private void trigger(Event event) {
        event.setSource(this);
        event.setTime(System.currentTimeMillis());

        try {
            if (event.getCallback() != null) {
                event.getCallback().invoke(event.getTarget(), event);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void trigger(String trigger) {
        if (!this.events.containsKey(trigger)) {
            return;
        }
        trigger(this.events.get(trigger).setTrigger(trigger));
    }

}
