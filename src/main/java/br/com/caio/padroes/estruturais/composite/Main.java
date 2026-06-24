package br.com.caio.padroes.estruturais.composite;

public class Main {
    public static void main(String[] args) {

        Composite root = new Composite("Raiz");

        Leaf folha1 = new Leaf("Folha 1");
        Leaf folha2 = new Leaf("Folha 2");

        Composite sub = new Composite("Subárvore");
        sub.add(new Leaf("Folha 3"));
        sub.add(new Leaf("Folha 4"));

        root.add(folha1);
        root.add(folha2);
        root.add(sub);

        root.operation();
    }
}