package br.com.caio.padroes.criacionais.factorymethod;

public abstract class Creator {

    public abstract Product factoryMethod();

    public void operar() {
        Product produto = factoryMethod();
        produto.executar();
    }
}