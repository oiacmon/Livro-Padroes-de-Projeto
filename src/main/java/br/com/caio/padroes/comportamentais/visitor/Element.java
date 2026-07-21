package br.com.caio.padroes.comportamentais.visitor;

public interface Element {
    void accept(Visitor visitor);
}