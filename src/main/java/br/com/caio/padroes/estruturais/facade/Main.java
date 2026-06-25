package br.com.caio.padroes.estruturais.facade;

public class Main {
    public static void main(String[] args) {

        Facade facade = new Facade();

        facade.operacaoSimples();
        facade.operacaoCompleta();
    }
}