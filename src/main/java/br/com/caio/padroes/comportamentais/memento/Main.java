package br.com.caio.padroes.comportamentais.memento;

public class Main {
    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("Estado 1");
        originator.setState("Estado 2");

        caretaker.add(originator.saveStateToMemento());

        originator.setState("Estado 3");

        caretaker.add(originator.saveStateToMemento());

        originator.setState("Estado 4");

        originator.restoreStateFromMemento(caretaker.get(0));
        originator.restoreStateFromMemento(caretaker.get(1));
    }
}