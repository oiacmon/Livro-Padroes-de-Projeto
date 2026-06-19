package br.com.caio.padroes.criacionais.abstractfactory;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Renderizando checkbox estilo Mac");
    }
}