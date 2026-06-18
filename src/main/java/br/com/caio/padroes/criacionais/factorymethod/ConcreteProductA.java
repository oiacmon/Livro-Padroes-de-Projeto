package br.com.caio.padroes.criacionais.factorymethod;

public class ConcreteProductA implements Product {
    @Override
    public void executar() {
        System.out.println("Executando Produto A");
    }
}