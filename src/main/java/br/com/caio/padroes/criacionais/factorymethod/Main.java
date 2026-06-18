package br.com.caio.padroes.criacionais.factorymethod;

public class Main {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Creator creatorB = new ConcreteCreatorB();

        creatorA.operar();
        creatorB.operar();
    }
}