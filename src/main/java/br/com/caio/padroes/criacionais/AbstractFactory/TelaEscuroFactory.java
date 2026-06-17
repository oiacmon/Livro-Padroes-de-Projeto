package br.com.caio.padroes.criacionais.AbstractFactory;

public class TelaEscuroFactory implements GUIFactory {
    @Override
    public Botao criarBotao() {
        return new BotaoEscuro();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaEscura();
    }
}