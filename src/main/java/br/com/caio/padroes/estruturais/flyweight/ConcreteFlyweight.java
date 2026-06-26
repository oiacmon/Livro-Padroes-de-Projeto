package br.com.caio.padroes.estruturais.flyweight;

public class ConcreteFlyweight implements Flyweight {

    private final char intrinsicState;

    public ConcreteFlyweight(char intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(int extrinsicState) {
        System.out.println("Caractere '" + intrinsicState + "' na posição " + extrinsicState);
    }
}