package br.com.caio.padroes.criacionais.builder;

public class Product {
    private String bread;
    private String meat;
    private String salad;

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    @Override
    public String toString() {
        return "Lanche: " + bread + ", " + meat + ", " + salad;
    }
}