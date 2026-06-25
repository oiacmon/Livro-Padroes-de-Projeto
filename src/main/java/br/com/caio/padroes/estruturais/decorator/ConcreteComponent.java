package br.com.caio.padroes.estruturais.decorator;

public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("Executando operação básica do componente.");
    }
}