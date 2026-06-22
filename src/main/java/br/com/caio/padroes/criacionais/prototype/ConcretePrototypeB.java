package br.com.caio.padroes.criacionais.prototype;

public class ConcretePrototypeB implements Prototype {

    private int valor = 42;

    @Override
    public Prototype clone() {
        ConcretePrototypeB clone = new ConcretePrototypeB();
        clone.valor = this.valor;
        return clone;
    }

    @Override
    public void executar() {
        System.out.println("Executando Prototype B com valor: " + valor);
    }
}