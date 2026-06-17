package br.com.caio.padroes.criacionais.AbstractFactory;

public class Main {
    public static void main(String[] args) {

        GUIFactory factory;

        factory = new TelaClaroFactory();
        factory.criarBotao().desenhar();
        factory.criarJanela().abrir();

        factory = new TelaEscuroFactory();
        factory.criarBotao().desenhar();
        factory.criarJanela().abrir();
    }
}