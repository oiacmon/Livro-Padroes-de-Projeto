package br.com.caio.padroes.comportamentais.visitor;

public class ConcreteElementA implements Element {

    private final int value;

    public ConcreteElementA(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementA(this);
    }
}