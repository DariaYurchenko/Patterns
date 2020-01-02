package challenges.iterator.iterators;

import java.util.ArrayList;

public class ConcreteIterator1 implements Iterator {
    ArrayList<Integer> list;

    public ConcreteIterator1(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    public void print() {

    }
}
