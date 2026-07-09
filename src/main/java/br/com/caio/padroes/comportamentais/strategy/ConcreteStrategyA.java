package br.com.caio.padroes.comportamentais.strategy;

public class ConcreteStrategyA implements Strategy {

    @Override
    public int execute(int a, int b) {
        System.out.println("Strategy A: somando valores.");
        return a + b;
    }
}