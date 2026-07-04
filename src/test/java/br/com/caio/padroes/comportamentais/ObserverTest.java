package br.com.caio.padroes.comportamentais;

import br.com.caio.padroes.comportamentais.observer.ConcreteObserverA;
import br.com.caio.padroes.comportamentais.observer.ConcreteObserverB;
import br.com.caio.padroes.comportamentais.observer.ConcreteSubject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {

    @Test
    void deveNotificarObserversQuandoEstadoMudar() {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserverA observerA = new ConcreteObserverA();
        ConcreteObserverB observerB = new ConcreteObserverB();

        subject.attach(observerA);
        subject.attach(observerB);

        subject.setState(42);

        assertEquals(42, observerA.getObservedState());
        assertEquals(42, observerB.getObservedState());
    }

    @Test
    void devePermitirRemoverObserver() {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserverA observerA = new ConcreteObserverA();
        ConcreteObserverB observerB = new ConcreteObserverB();

        subject.attach(observerA);
        subject.attach(observerB);

        subject.detach(observerB);

        subject.setState(7);

        assertEquals(7, observerA.getObservedState());
        assertEquals(0, observerB.getObservedState());
    }
}