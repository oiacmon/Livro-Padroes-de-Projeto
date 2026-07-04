package br.com.caio.padroes.comportamentais.observer;

public class Main {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserverA observerA = new ConcreteObserverA();
        ConcreteObserverB observerB = new ConcreteObserverB();

        subject.attach(observerA);
        subject.attach(observerB);

        subject.setState(10);
        subject.setState(20);
    }
}