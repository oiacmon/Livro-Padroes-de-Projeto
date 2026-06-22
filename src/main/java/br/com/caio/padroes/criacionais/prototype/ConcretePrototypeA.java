package br.com.caio.padroes.criacionais.prototype;

public class ConcretePrototypeA implements Prototype {

    private String atributo = "A";

    @Override
    public Prototype clone() {
        ConcretePrototypeA clone = new ConcretePrototypeA();
        clone.atributo = this.atributo;
        return clone;
    }

    @Override
    public void executar() {
        System.out.println("Executando Prototype A com atributo: " + atributo);
    }
}