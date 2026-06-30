package br.com.caio.padroes.comportamentais.iterator;

public class Main {
    public static void main(String[] args) {

        ConcreteAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("Caio");
        aggregate.add("Iterator");
        aggregate.add("Pattern");

        Iterator<String> iterator = aggregate.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}