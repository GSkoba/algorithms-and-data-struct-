package seminar.iterators;

import java.util.Iterator;

public interface IPeekingIterator<E> extends Iterator<E> {

    public E peek();
}

