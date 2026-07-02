package br.com.caio.padroes.comportamentais;

import br.com.caio.padroes.comportamentais.memento.Caretaker;
import br.com.caio.padroes.comportamentais.memento.Originator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MementoTest {

    @Test
    void deveSalvarERecuperarEstado() {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("A");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("B");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("C");

        originator.restoreStateFromMemento(caretaker.get(0));
        assertEquals("A", originator.getState());

        originator.restoreStateFromMemento(caretaker.get(1));
        assertEquals("B", originator.getState());
    }
}