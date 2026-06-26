package br.com.caio.padroes.estruturais;

import br.com.caio.padroes.estruturais.flyweight.Flyweight;
import br.com.caio.padroes.estruturais.flyweight.FlyweightFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FlyweightTest {

    @Test
    void deveCompartilharFlyweights() {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight f1 = factory.getFlyweight('a');
        Flyweight f2 = factory.getFlyweight('a');

        assertSame(f1, f2);
        assertEquals(1, factory.poolSize());
    }

    @Test
    void deveCriarFlyweightsDiferentesParaChavesDiferentes() {
        FlyweightFactory factory = new FlyweightFactory();

        factory.getFlyweight('a');
        factory.getFlyweight('b');

        assertEquals(2, factory.poolSize());
    }
}