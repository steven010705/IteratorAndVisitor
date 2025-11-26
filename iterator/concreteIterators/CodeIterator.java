package iterator.concreteIterators;

import iterator.concreteCollections.CodeCollection;

import java.util.Iterator;

public class CodeIterator implements Iterator<String> {

    private Iterator<String> internalIterator;

    public CodeIterator(CodeCollection collection) {
        this.internalIterator = collection.getCodes().iterator();
    }

    @Override
    public boolean hasNext() {
        return internalIterator.hasNext();
    }

    @Override
    public String next() {
        return internalIterator.next();
    }
}
