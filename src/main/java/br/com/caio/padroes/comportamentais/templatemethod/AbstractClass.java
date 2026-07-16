package br.com.caio.padroes.comportamentais.templatemethod;

public abstract class AbstractClass {

    public final void templateMethod() {
        step1();
        step2();
        step3();
    }

    protected void step1() {
        System.out.println("Passo 1: comportamento padrão.");
    }

    protected abstract void step2();

    protected void step3() {
        System.out.println("Passo 3: comportamento padrão.");
    }
}