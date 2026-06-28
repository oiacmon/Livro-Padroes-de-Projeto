package br.com.caio.padroes.comportamentais.chainofresponsibility;

public abstract class Handler {

    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public void handle(int value) {
        if (next != null) {
            next.handle(value);
        }
    }
}