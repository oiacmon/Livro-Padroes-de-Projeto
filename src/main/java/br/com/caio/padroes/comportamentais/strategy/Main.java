package br.com.caio.padroes.comportamentais.strategy;

public class Main {
    public static void main(String[] args) {

        Context context = new Context(new ConcreteStrategyA());

        System.out.println("Resultado: " + context.executeStrategy(10, 5));

        context.setStrategy(new ConcreteStrategyB());
        System.out.println("Resultado: " + context.executeStrategy(10, 5));
    }
}