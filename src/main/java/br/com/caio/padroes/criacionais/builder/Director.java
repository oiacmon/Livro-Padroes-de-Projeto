package br.com.caio.padroes.criacionais.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildBread();
        builder.buildMeat();
        builder.buildSalad();
    }
}