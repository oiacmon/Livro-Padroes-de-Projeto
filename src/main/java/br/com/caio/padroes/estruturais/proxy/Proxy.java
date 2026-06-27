package br.com.caio.padroes.estruturais.proxy;

public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        System.out.println("Proxy: verificando acesso antes de delegar...");
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
        System.out.println("Proxy: operação finalizada.");
    }
}