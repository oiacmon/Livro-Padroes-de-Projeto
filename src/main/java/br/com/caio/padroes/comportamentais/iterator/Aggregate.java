package br.com.caio.padroes.comportamentais.iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}