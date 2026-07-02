package br.com.caio.padroes.comportamentais.memento;

public class Originator {

    private String state;

    public void setState(String state) {
        System.out.println("Originator: novo estado = " + state);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        System.out.println("Originator: salvando estado...");
        return new Memento(state);
    }

    public void restoreStateFromMemento(Memento memento) {
        this.state = memento.getState();
        System.out.println("Originator: estado restaurado = " + state);
    }
}