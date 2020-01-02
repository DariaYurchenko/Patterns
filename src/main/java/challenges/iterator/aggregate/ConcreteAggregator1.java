package challenges.iterator.aggregate;

import challenges.iterator.iterators.ConcreteIterator1;
import challenges.iterator.iterators.Iterator;

import java.util.ArrayList;

public class ConcreteAggregator1 implements Aggregate {
    private ArrayList<Integer> integers;

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator1(integers);
    }
}
