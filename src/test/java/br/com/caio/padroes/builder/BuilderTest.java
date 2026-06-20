package br.com.caio.padroes.criacionais;

import br.com.caio.padroes.criacionais.builder.Builder;
import br.com.caio.padroes.criacionais.builder.ConcreteBuilder;
import br.com.caio.padroes.criacionais.builder.Director;
import br.com.caio.padroes.criacionais.builder.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {

    @Test
    void deveConstruirLancheCompleto() {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        director.construct();
        Product lanche = builder.getResult();

        assertNotNull(lanche);
        assertTrue(lanche.toString().contains("Pão Australiano"));
        assertTrue(lanche.toString().contains("Carne de Búfalo"));
        assertTrue(lanche.toString().contains("Alface e Tomate"));
    }
}