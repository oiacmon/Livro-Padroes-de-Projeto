package br.com.caio.padroes.criacionais.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void executar() {
        System.out.println("Executando lógica do Singleton");
    }
}