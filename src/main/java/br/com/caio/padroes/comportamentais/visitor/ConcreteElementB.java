package br.com.caio.padroes.comportamentais.visitor;

public class ConcreteElementB implements Element {

    private final String text;

    public ConcreteElementB(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }
}