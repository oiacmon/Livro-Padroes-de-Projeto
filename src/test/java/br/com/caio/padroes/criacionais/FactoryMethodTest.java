package br.com.caio.padroes.criacionais;

import br.com.caio.padroes.criacionais.factorymethod.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

    @Test
    void deveCriarProdutoA() {
        Creator creator = new ConcreteCreatorA();
        Product produto = creator.factoryMethod();
        assertTrue(produto instanceof ConcreteProductA);
    }

    @Test
    void deveCriarProdutoB() {
        Creator creator = new ConcreteCreatorB();
        Product produto = creator.factoryMethod();
        assertTrue(produto instanceof ConcreteProductB);
    }
}