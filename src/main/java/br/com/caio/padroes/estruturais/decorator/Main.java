package br.com.caio.padroes.estruturais.decorator;

public class Main {
    public static void main(String[] args) {

        Component componente = new ConcreteComponent();

        Component decoradoA = new ConcreteDecoratorA(componente);
        Component decoradoB = new ConcreteDecoratorB(decoradoA);

        decoradoB.operation();
    }
}