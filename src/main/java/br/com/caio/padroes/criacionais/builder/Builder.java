package br.com.caio.padroes.criacionais.builder;

public interface Builder {
    void buildBread();
    void buildMeat();
    void buildSalad();
    Product getResult();
}