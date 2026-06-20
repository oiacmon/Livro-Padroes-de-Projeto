package br.com.caio.padroes.criacionais.builder;

public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    @Override
    public void buildBread() {
        product.setBread("Pão Australiano");
    }

    @Override
    public void buildMeat() {
        product.setMeat("Carne de Búfalo");
    }

    @Override
    public void buildSalad() {
        product.setSalad("Alface e Tomate");
    }

    @Override
    public Product getResult() {
        return product;
    }
}