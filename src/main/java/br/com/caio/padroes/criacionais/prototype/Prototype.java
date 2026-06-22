package br.com.caio.padroes.criacionais.prototype;

public interface Prototype {
    Prototype clone();
    void executar();
}