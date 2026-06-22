package br.com.caio.padroes.criacionais;

import br.com.caio.padroes.criacionais.prototype.ConcretePrototypeA;
import br.com.caio.padroes.criacionais.prototype.ConcretePrototypeB;
import br.com.caio.padroes.criacionais.prototype.Prototype;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {

    @Test
    void deveClonarPrototypeA() {
        Prototype original = new ConcretePrototypeA();
        Prototype clone = original.clone();

        assertNotSame(original, clone);
        assertTrue(clone instanceof ConcretePrototypeA);
    }

    @Test
    void deveClonarPrototypeB() {
        Prototype original = new ConcretePrototypeB();
        Prototype clone = original.clone();

        assertNotSame(original, clone);
        assertTrue(clone instanceof ConcretePrototypeB);
    }
}