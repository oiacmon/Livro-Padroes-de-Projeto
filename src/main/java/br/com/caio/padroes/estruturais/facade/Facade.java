package br.com.caio.padroes.estruturais.facade;

public class Facade {

    private SubsystemA a = new SubsystemA();
    private SubsystemB b = new SubsystemB();
    private SubsystemC c = new SubsystemC();

    public void operacaoSimples() {
        System.out.println("Executando operação simples via Facade...");
        a.operationA();
        b.operationB();
    }

    public void operacaoCompleta() {
        System.out.println("Executando operação completa via Facade...");
        a.operationA();
        b.operationB();
        c.operationC();
    }
}