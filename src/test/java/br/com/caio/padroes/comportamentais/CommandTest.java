package br.com.caio.padroes.comportamentais;

import br.com.caio.padroes.comportamentais.command.Command;
import br.com.caio.padroes.comportamentais.command.ConcreteCommand;
import br.com.caio.padroes.comportamentais.command.Invoker;
import br.com.caio.padroes.comportamentais.command.Receiver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CommandTest {

    @Test
    void deveExecutarComandoSemErros() {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.setCommand(command);

        assertDoesNotThrow(invoker::executeCommand);
    }

    @Test
    void deveLidarComInvokerSemComando() {
        Invoker invoker = new Invoker();
        assertDoesNotThrow(invoker::executeCommand);
    }
}