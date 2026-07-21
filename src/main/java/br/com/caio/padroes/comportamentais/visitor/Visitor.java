package br.com.caio.padroes.comportamentais.visitor;

public interface Visitor {
    void visitConcreteElementA(ConcreteElementA element);
    void visitConcreteElementB(ConcreteElementB element);
}