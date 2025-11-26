package iterator.concreteCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Person;

public class PersonCollection implements Iterable<Person> {

    private List<Person> people = new ArrayList<>();

    public void add(Person p) {
        people.add(p);
    }

    public List<Person> getPeople() {
        return people;
    }

    @Override
    public Iterator<Person> iterator() {
        return people.iterator();
    }

    public Iterator<Person> createIterator() {
        return people.iterator();
    }
}
