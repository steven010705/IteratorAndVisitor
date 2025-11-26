package iterator;
import java.util.Iterator;

public interface IterableCollection<E> {
    Iterator<E> createIterator();
}