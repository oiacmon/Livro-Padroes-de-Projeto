package br.com.caio.padroes.comportamentais.chainofresponsibility;

public class Main {
    public static void main(String[] args) {

        Handler h1 = new ConcreteHandlerA();
        Handler h2 = new ConcreteHandlerB();
        Handler h3 = new ConcreteHandlerC();

        h1.setNext(h2);
        h2.setNext(h3);

        h1.handle(5);
        h1.handle(15);
        h1.handle(25);
    }
}