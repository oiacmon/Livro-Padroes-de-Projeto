package br.com.caio.padroes.estruturais.flyweight;

public class Main {
    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();

        String texto = "banana";

        for (int i = 0; i < texto.length(); i++) {
            Flyweight fw = factory.getFlyweight(texto.charAt(i));
            fw.operation(i); // posição é estado extrínseco
        }

        System.out.println("Objetos únicos criados: " + factory.poolSize());
    }
}