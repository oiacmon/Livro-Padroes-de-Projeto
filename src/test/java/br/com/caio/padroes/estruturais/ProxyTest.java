package br.com.caio.padroes.estruturais;

import br.com.caio.padroes.estruturais.proxy.Proxy;
import br.com.caio.padroes.estruturais.proxy.Subject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProxyTest {

    @Test
    void deveDelegarParaRealSubjectSemErros() {
        Subject subject = new Proxy();
        assertDoesNotThrow(subject::request);
    }
}