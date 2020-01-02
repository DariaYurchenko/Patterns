package challenges.observer.publishers;

import challenges.observer.observers.Observer;

import java.util.List;

public class WeatherStation implements Subject {
    private String temperature;
    private String pressure;
    private List<Observer> observers;

    public WeatherStation(List<Observer> observers) {
        this.observers = observers;

    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for(int i =0; i< observers.size(); i++) {
            observers.get(i).update(temperature, pressure);
        }

    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
        notifyObservers();
    }
}
