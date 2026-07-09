package br.com.caio.padroes.comportamentais.strategy;

public class ConcreteStrategyB implements Strategy {

    @Override
    public int execute(int a, int b) {
        System.out.println("Strategy B: multiplicando valores.");
        return a * b;
    }
}