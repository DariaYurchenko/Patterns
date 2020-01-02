package challenges.observer.observers;

import challenges.observer.publishers.Subject;

public class UserInterface implements Observer {
    private String temperature;
    private String pressure;
    private Subject subject;

    public UserInterface (Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String temperature, String pressure) {
        this.pressure = pressure;
        this.temperature = temperature;
        display();

    }

    public void display() {
        System.out.println(temperature + " " + pressure);
    }
}
