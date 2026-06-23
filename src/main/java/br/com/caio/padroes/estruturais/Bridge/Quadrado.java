package br.com.caio.padroes.estruturais.Bridge;

public class Quadrado extends Forma {

    public Quadrado(Cor cor) {
        super(cor);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando quadrado na cor " + cor.aplicarCor());
    }
}