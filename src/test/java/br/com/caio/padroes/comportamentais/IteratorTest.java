package br.com.caio.padroes.comportamentais;

import br.com.caio.padroes.comportamentais.iterator.ConcreteAggregate;
import br.com.caio.padroes.comportamentais.iterator.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {

    @Test
    void deveIterarSobreElementos() {
        ConcreteAggregate<Integer> aggregate = new ConcreteAggregate<>();
        aggregate.add(1);
        aggregate.add(2);
        aggregate.add(3);

        Iterator<Integer> iterator = aggregate.createIterator();

        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertEquals(2, iterator.next());
        assertEquals(3, iterator.next());
        assertFalse(iterator.hasNext());
    }
}