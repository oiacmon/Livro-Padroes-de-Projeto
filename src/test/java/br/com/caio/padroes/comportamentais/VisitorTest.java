package br.com.caio.padroes.comportamentais;

import br.com.caio.padroes.comportamentais.visitor.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {

    @Test
    void deveVisitarTodosOsElementos() {
        ObjectStructure structure = new ObjectStructure();
        structure.add(new ConcreteElementA(5));
        structure.add(new ConcreteElementB("Teste"));

        Visitor visitor = new ConcreteVisitor();

        assertDoesNotThrow(() -> structure.applyVisitor(visitor));
    }
}