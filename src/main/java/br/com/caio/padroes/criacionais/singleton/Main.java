package br.com.caio.padroes.criacionais.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("São a mesma instância? " + (s1 == s2));

        s1.executar();
    }
}