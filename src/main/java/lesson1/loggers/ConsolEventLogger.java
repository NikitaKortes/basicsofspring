package lesson1.loggers;

import lesson1.beans.Event;

public class ConsolEventLogger implements EventLogger {

    public void logEvent(Event event) {
        System.out.println(event);
    }
}
