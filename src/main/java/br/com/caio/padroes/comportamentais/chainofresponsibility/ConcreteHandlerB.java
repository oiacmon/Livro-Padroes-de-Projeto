package br.com.caio.padroes.comportamentais.chainofresponsibility;

public class ConcreteHandlerB extends Handler {

    @Override
    public void handle(int value) {
        if (value >= 10 && value < 20) {
            System.out.println("Handler B tratou o valor: " + value);
        } else {
            System.out.println("Handler B não tratou, passando adiante...");
            super.handle(value);
        }
    }
}