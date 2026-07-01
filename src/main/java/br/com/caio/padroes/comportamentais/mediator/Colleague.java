package br.com.caio.padroes.comportamentais.mediator;

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendEvent(String event) {
        mediator.notify(this, event);
    }
}