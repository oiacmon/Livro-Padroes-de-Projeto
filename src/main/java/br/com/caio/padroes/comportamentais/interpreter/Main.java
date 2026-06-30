package br.com.caio.padroes.comportamentais.interpreter;

public class Main {
    public static void main(String[] args) {

        Expression expr = new SubtractExpression(
                new AddExpression(
                        new NumberExpression(10),
                        new NumberExpression(5)
                ),
                new NumberExpression(3)
        );

        System.out.println("Resultado: " + expr.interpret());
    }
}