package br.com.caio.padroes.estruturais.proxy;

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("Executando operação real no RealSubject.");
    }
}