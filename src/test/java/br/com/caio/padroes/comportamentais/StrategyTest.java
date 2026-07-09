package br.com.caio.padroes.comportamentais;

import br.com.caio.padroes.comportamentais.strategy.ConcreteStrategyA;
import br.com.caio.padroes.comportamentais.strategy.ConcreteStrategyB;
import br.com.caio.padroes.comportamentais.strategy.Context;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StrategyTest {

    @Test
    void deveExecutarEstrategiaA() {
        Context context = new Context(new ConcreteStrategyA());
        assertEquals(15, context.executeStrategy(10, 5));
    }

    @Test
    void deveExecutarEstrategiaB() {
        Context context = new Context(new ConcreteStrategyB());
        assertEquals(50, context.executeStrategy(10, 5));
    }

    @Test
    void deveTrocarEstrategiaEmTempoDeExecucao() {
        Context context = new Context(new ConcreteStrategyA());
        assertEquals(15, context.executeStrategy(10, 5));

        context.setStrategy(new ConcreteStrategyB());
        assertEquals(50, context.executeStrategy(10, 5));
    }
}