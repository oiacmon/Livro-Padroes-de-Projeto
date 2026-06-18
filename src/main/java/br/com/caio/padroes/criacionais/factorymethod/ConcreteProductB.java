package br.com.caio.padroes.criacionais.factorymethod;

public class ConcreteProductB implements Product {
    @Override
    public void executar() {
        System.out.println("Executando Produto B");
    }
}