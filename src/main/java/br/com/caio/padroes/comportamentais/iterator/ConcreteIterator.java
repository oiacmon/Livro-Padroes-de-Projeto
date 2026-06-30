package br.com.caio.padroes.comportamentais.iterator;

import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {

    private final List<T> items;
    private int index = 0;

    public ConcreteIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return index < items.size();
    }

    @Override
    public T next() {
        return items.get(index++);
    }
}