package br.com.caio.padroes.comportamentais.templatemethod;

public class Main {
    public static void main(String[] args) {

        AbstractClass a = new ConcreteClassA();
        AbstractClass b = new ConcreteClassB();

        System.out.println("Executando A:");
        a.templateMethod();

        System.out.println("\nExecutando B:");
        b.templateMethod();
    }
}