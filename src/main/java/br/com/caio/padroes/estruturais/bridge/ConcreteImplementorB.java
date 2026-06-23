package br.com.caio.padroes.estruturais.bridge;

public class ConcreteImplementorB implements Implementor {
    @Override
    public void operacaoImplementada() {
        System.out.println("Implementação B executada");
    }
}