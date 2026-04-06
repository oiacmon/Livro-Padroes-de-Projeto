package org.example.Criacao.Singleton;

public class Main {
    public static void main(String[] args) {

        LogManager log1 = LogManager.getInstance();
        LogManager log2 = LogManager.getInstance();

        log1.log("Primeira mensagem");
        log2.log("Segunda mensagem");

        System.out.println("São a mesma instância? " + (log1 == log2));
    }
}