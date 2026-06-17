package br.com.caio.padroes.criacionais.AbstractFactory;

public class BotaoClaro implements Botao {
    @Override
    public void desenhar() {
        System.out.println("Desenhando botão claro");
    }
}