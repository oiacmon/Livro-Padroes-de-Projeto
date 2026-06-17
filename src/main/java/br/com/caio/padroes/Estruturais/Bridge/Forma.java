package br.com.caio.padroes.Estruturais.Bridge;

public abstract class Forma {

    protected Cor cor;

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public abstract void desenhar();
}