package br.com.caio.padroes.criacionais.abstractfactory;

public class Main {
    public static void main(String[] args) {

        GUIFactory factory;

        String sistema = System.getProperty("os.name").toLowerCase();

        if (sistema.contains("win")) {
            factory = new WinFactory();
        } else {
            factory = new MacFactory();
        }

        Button botao = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        botao.paint();
        checkbox.paint();
    }
}