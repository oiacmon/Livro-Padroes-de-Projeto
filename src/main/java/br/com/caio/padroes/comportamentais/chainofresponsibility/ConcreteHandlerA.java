package br.com.caio.padroes.comportamentais.chainofresponsibility;

public class ConcreteHandlerA extends Handler {

    @Override
    public void handle(int value) {
        if (value < 10) {
            System.out.println("Handler A tratou o valor: " + value);
        } else {
            System.out.println("Handler A não tratou, passando adiante...");
            super.handle(value);
        }
    }
}