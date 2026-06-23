package br.com.caio.padroes.estruturais;

import br.com.caio.padroes.estruturais.bridge.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BridgeTest {

    @Test
    void deveUsarImplementacaoA() {
        Implementor impl = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(impl);

        assertDoesNotThrow(abs::operacao);
    }

    @Test
    void deveUsarImplementacaoB() {
        Implementor impl = new ConcreteImplementorB();
        Abstraction abs = new RefinedAbstraction(impl);

        assertDoesNotThrow(abs::operacao);
    }
}