package br.com.caio.padroes.comportamentais.mediator;

public interface Mediator {
    void notify(Colleague sender, String event);
}