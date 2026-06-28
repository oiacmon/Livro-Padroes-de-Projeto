package br.com.caio.padroes.comportamentais.chainofresponsibility;

public class ConcreteHandlerC extends Handler {

    @Override
    public void handle(int value) {
        if (value >= 20) {
            System.out.println("Handler C tratou o valor: " + value);
        } else {
            System.out.println("Handler C não tratou, fim da cadeia.");
            super.handle(value);
        }
    }
}