package br.com.caio.padroes.estruturais.decorator;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("Adicionando comportamento do Decorator A.");
    }
}