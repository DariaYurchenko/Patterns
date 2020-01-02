package challenges.observer.observers;

import challenges.observer.publishers.Subject;

public class Logger implements Observer {
    private String temperature;
    private String pressure;
    private Subject subject;

    public Logger(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    @Override
    public void update(String temperature, String pressure) {
        this.pressure = pressure;
        this.temperature = temperature;
        log();

    }

    public void log() {
        System.out.println(temperature + " " + pressure);
    }
}
