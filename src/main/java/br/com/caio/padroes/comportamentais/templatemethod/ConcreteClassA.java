package br.com.caio.padroes.comportamentais.templatemethod;

public class ConcreteClassA extends AbstractClass {

    @Override
    protected void step2() {
        System.out.println("ConcreteClassA: executando passo 2 específico.");
    }
}