package br.com.caio.padroes.estruturais.bridge;

public class ConcreteImplementorA implements Implementor {
    @Override
    public void operacaoImplementada() {
        System.out.println("Implementação A executada");
    }
}