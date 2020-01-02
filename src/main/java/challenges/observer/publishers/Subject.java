package challenges.observer.publishers;

import challenges.observer.observers.Observer;

public interface Subject  {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
