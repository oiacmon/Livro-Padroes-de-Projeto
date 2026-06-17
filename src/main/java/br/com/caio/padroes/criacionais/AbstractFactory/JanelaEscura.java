package br.com.caio.padroes.criacionais.AbstractFactory;

public class JanelaEscura implements Janela {
    @Override
    public void abrir() {
        System.out.println("Abrindo janela escura");
    }
}