package br.com.caio.padroes.estruturais.bridge;

public class Main {
    public static void main(String[] args) {

        Abstraction absA = new RefinedAbstraction(new ConcreteImplementorA());
        Abstraction absB = new RefinedAbstraction(new ConcreteImplementorB());

        absA.operacao();
        absB.operacao();
    }
}