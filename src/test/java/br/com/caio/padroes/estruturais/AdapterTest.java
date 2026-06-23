package br.com.caio.padroes.estruturais.adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdapterTest {

    @Test
    void deveAdaptarChamada() {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);

        assertDoesNotThrow(adapter::request);
    }
}