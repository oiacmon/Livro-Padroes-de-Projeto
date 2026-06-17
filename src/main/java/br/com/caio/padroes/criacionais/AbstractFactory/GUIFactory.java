package br.com.caio.padroes.criacionais.AbstractFactory;

public interface GUIFactory {
    Botao criarBotao();
    Janela criarJanela();
}