package challenges.iterator.aggregate;

import challenges.iterator.iterators.ConcreteIterator2;
import challenges.iterator.iterators.Iterator;

public class ConcreteAggregator2 implements Aggregate {
    private Integer[] integers;

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator2(integers);

    }
}
