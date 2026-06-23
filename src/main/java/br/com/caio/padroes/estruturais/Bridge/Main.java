package br.com.caio.padroes.estruturais.Bridge;

public class Main {
    public static void main(String[] args) {

        Forma circuloVermelho = new Circulo(new Vermelho());
        circuloVermelho.desenhar();

        Forma quadradoAzul = new Quadrado(new Azul());
        quadradoAzul.desenhar();
    }
}