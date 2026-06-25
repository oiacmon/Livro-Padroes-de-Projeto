package br.com.caio.padroes.estruturais;

import br.com.caio.padroes.estruturais.decorator.Component;
import br.com.caio.padroes.estruturais.decorator.ConcreteComponent;
import br.com.caio.padroes.estruturais.decorator.ConcreteDecoratorA;
import br.com.caio.padroes.estruturais.decorator.ConcreteDecoratorB;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    @Test
    void deveExecutarDecoracoesSemErros() {
        Component component = new ConcreteComponent();
        Component decorated = new ConcreteDecoratorB(new ConcreteDecoratorA(component));

        assertDoesNotThrow(decorated::operation);
    }
}