package iterator.concreteIterators;
import java.util.Iterator;

import iterator.concreteCollections.PersonCollection;
import model.Person;

public class PersonIterator implements Iterator<Person> {

    private PersonCollection collection;
    private int index = 0;

    public PersonIterator(PersonCollection c) {
        this.collection = c;
    }

    @Override
    public boolean hasNext() {
        return index < collection.getPeople().size();
    }

    @Override
    public Person next() {
        return collection.getPeople().get(index++);
    }
}
