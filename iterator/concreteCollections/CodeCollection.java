package iterator.concreteCollections;

import iterator.concreteIterators.CodeIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CodeCollection implements Iterable<String> {

    private Collection<String> codes;

    public CodeCollection() {
        this.codes = new ArrayList<>();
    }

    public void add(String code) {
        codes.add(code);
    }

    public Collection<String> getCodes() {
        return this.codes;
    }

    @Override
    public Iterator<String> iterator() {
        return new CodeIterator(this);
    }

    public Iterator<String> createIterator() {
        return new CodeIterator(this);
    }
}
