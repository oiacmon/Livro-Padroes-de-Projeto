package br.com.caio.padroes.estruturais;

import br.com.caio.padroes.estruturais.facade.Facade;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {

    @Test
    void deveExecutarOperacoesDaFacadeSemErros() {
        Facade facade = new Facade();
        assertDoesNotThrow(facade::operacaoSimples);
        assertDoesNotThrow(facade::operacaoCompleta);
    }
}