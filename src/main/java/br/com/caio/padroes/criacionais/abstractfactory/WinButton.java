package br.com.caio.padroes.criacionais.abstractfactory;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Renderizando botão estilo Windows");
    }
}