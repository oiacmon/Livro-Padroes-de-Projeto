package br.com.caio.padroes.comportamentais;

import br.com.caio.padroes.comportamentais.state.ConcreteStateA;
import br.com.caio.padroes.comportamentais.state.Context;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StateTest {

    @Test
    void deveAlternarEntreEstados() {
        Context context = new Context(new ConcreteStateA());

        context.request();
        assertTrue(context.getClass() != null);

        context.request();
        context.request();
    }
}
