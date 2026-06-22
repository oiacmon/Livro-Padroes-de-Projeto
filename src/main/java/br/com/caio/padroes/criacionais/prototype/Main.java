package br.com.caio.padroes.criacionais.prototype;

public class Main {
    public static void main(String[] args) {

        Prototype protA = new ConcretePrototypeA();
        Prototype protB = new ConcretePrototypeB();

        Prototype cloneA = protA.clone();
        Prototype cloneB = protB.clone();

        cloneA.executar();
        cloneB.executar();
    }
}