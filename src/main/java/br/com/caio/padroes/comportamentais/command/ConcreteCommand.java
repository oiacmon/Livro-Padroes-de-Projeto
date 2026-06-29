package br.com.caio.padroes.comportamentais.command;

public class ConcreteCommand implements Command {

    private final Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("ConcreteCommand: delegando ação para o Receiver.");
        receiver.action();
    }
}