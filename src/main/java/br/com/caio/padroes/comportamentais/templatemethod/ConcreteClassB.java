package br.com.caio.padroes.comportamentais.templatemethod;

public class ConcreteClassB extends AbstractClass {

    @Override
    protected void step2() {
        System.out.println("ConcreteClassB: executando passo 2 alternativo.");
    }
}