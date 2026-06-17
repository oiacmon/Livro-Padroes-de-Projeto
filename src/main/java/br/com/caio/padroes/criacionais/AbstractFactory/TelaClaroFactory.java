package br.com.caio.padroes.criacionais.AbstractFactory;

public class TelaClaroFactory implements GUIFactory {
    @Override
    public Botao criarBotao() {
        return new BotaoClaro();
    }

    @Override
    public Janela criarJanela() {
        return new JanelaClara();
    }
}