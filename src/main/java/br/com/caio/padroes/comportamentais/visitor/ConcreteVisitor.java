package br.com.caio.padroes.comportamentais.visitor;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visitConcreteElementA(ConcreteElementA element) {
        System.out.println("Visitor: processando Elemento A -> valor = " + element.getValue());
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB element) {
        System.out.println("Visitor: processando Elemento B -> texto = " + element.getText());
    }
}