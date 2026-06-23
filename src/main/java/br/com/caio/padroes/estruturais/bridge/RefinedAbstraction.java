package br.com.caio.padroes.estruturais.bridge;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operacao() {
        System.out.println("Operação da Abstração Refinada");
        implementor.operacaoImplementada();
    }
}