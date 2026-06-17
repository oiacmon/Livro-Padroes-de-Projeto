package br.com.caio.padroes.criacionais.AbstractFactory;

public class BotaoEscuro implements Botao {
    @Override
    public void desenhar() {
        System.out.println("Desenhando botão escuro");
    }
}