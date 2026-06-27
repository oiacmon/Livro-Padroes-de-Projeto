package br.com.caio.padroes.estruturais.proxy;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Proxy();

        subject.request();
    }
}