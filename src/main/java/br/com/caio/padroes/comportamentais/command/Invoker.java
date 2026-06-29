package br.com.caio.padroes.comportamentais.command;

public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        if (command != null) {
            System.out.println("Invoker: disparando comando.");
            command.execute();
        } else {
            System.out.println("Invoker: nenhum comando configurado.");
        }
    }
}