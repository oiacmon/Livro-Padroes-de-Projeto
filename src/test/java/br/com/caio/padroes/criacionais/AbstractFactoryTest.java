package br.com.caio.padroes.criacionais;

import br.com.caio.padroes.criacionais.abstractfactory.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    void deveCriarComponentesWindows() {
        GUIFactory factory = new WinFactory();

        assertTrue(factory.createButton() instanceof WinButton);
        assertTrue(factory.createCheckbox() instanceof WinCheckbox);
    }

    @Test
    void deveCriarComponentesMac() {
        GUIFactory factory = new MacFactory();

        assertTrue(factory.createButton() instanceof MacButton);
        assertTrue(factory.createCheckbox() instanceof MacCheckbox);
    }
}