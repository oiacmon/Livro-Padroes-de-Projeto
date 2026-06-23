package br.com.caio.padroes.estruturais.Bridge;

public class Circulo extends Forma {

    public Circulo(Cor cor) {
        super(cor);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando círculo na cor " + cor.aplicarCor());
    }
}