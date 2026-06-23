package br.com.caio.padroes.estruturais.adapter;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("Adaptando chamada...");
        adaptee.specificRequest();
    }
}