package br.com.caio.padroes.comportamentais;

import br.com.caio.padroes.comportamentais.chainofresponsibility.ConcreteHandlerA;
import br.com.caio.padroes.comportamentais.chainofresponsibility.ConcreteHandlerB;
import br.com.caio.padroes.comportamentais.chainofresponsibility.ConcreteHandlerC;
import br.com.caio.padroes.comportamentais.chainofresponsibility.Handler;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChainOfResponsibilityTest {

    @Test
    void devePercorrerCadeiaSemErros() {
        Handler h1 = new ConcreteHandlerA();
        Handler h2 = new ConcreteHandlerB();
        Handler h3 = new ConcreteHandlerC();

        h1.setNext(h2);
        h2.setNext(h3);

        assertDoesNotThrow(() -> {
            h1.handle(5);
            h1.handle(15);
            h1.handle(25);
        });
    }
}