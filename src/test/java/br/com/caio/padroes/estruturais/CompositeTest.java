package br.com.caio.padroes.estruturais;

import br.com.caio.padroes.estruturais.composite.Composite;
import br.com.caio.padroes.estruturais.composite.Leaf;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompositeTest {

    @Test
    void deveExecutarOperacaoSemErros() {
        Composite root = new Composite("Raiz");
        root.add(new Leaf("Folha A"));
        root.add(new Leaf("Folha B"));

        Composite sub = new Composite("Sub");
        sub.add(new Leaf("Folha C"));

        root.add(sub);

        assertDoesNotThrow(root::operation);
    }
}