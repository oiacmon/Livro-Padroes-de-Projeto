package br.com.caio.padroes.comportamentais.memento;

public class Memento {

    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    String getState() {
        return state;
    }
}