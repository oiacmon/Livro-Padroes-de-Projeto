package br.com.caio.padroes.criacionais.abstractfactory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Renderizando botão estilo Mac");
    }
}