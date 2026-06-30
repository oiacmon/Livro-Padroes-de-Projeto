package br.com.caio.padroes.comportamentais.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}