package challenges.iterator.iterators;

public class ConcreteIterator2 implements Iterator {
    Integer[] integers;

    public ConcreteIterator2(Integer[] integers) {
        this.integers = integers;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
