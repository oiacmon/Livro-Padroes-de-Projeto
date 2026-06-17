package br.com.caio.padroes.criacionais.AbstractFactory;

public class JanelaClara implements Janela {
    @Override
    public void abrir() {
        System.out.println("Abrindo janela clara");
    }
}