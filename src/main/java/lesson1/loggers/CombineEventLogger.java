package lesson1.loggers;

import lesson1.beans.Event;

import java.util.Collection;

public class CombineEventLogger implements EventLogger {

    private final Collection<EventLogger> loggers;

    public CombineEventLogger(Collection<EventLogger> loggers) {
        this.loggers = loggers;
    }

    public void logEvent(Event event) {
        for (EventLogger eventLogger : loggers)
            eventLogger.logEvent(event);
    }
}
