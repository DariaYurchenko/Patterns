package challenges.memento;

import java.util.List;

public class CareTaker {
    private Originator originator;
    private List<Originator.Memento> mementos;

    public void doSmth() {
        Originator.Memento memento = originator.save();
        mementos.add(memento);
    }

    public void undo() {
        Originator.Memento memento = mementos.get(1);
        originator.restore(memento);
    }
}
