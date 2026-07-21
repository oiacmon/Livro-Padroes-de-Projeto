package br.com.caio.padroes.comportamentais.visitor;

public class Main {
    public static void main(String[] args) {

        ObjectStructure structure = new ObjectStructure();

        structure.add(new ConcreteElementA(10));
        structure.add(new ConcreteElementB("Olá Caio"));
        structure.add(new ConcreteElementA(42));

        Visitor visitor = new ConcreteVisitor();

        structure.applyVisitor(visitor);
    }
}