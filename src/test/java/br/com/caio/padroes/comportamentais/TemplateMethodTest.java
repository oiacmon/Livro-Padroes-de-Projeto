package br.com.caio.padroes.comportamentais;

import br.com.caio.padroes.comportamentais.templatemethod.AbstractClass;
import br.com.caio.padroes.comportamentais.templatemethod.ConcreteClassA;
import br.com.caio.padroes.comportamentais.templatemethod.ConcreteClassB;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemplateMethodTest {

    @Test
    void deveExecutarTemplateMethodSemErros() {
        AbstractClass a = new ConcreteClassA();
        AbstractClass b = new ConcreteClassB();

        assertDoesNotThrow(a::templateMethod);
        assertDoesNotThrow(b::templateMethod);
    }
}