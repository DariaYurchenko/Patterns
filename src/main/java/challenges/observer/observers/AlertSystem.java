package challenges.observer.observers;

import challenges.observer.publishers.Subject;

public class AlertSystem implements Observer {
    private String temperature;
    private String pressure;
    private Subject subject;

    public AlertSystem(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String temperature, String pressure) {
        this.pressure = pressure;
        this.temperature = temperature;
        alert();
    }

    public void alert() {
        System.out.println(temperature + " " + pressure);
    }
}
