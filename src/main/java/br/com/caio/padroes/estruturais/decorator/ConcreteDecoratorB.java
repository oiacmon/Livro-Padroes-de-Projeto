package br.com.caio.padroes.estruturais.decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("Adicionando comportamento do Decorator B.");
    }
}