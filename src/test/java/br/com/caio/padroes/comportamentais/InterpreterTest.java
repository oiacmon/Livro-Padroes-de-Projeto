package br.com.caio.padroes.comportamentais.interpreter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InterpreterTest {

    @Test
    void deveInterpretarExpressaoSimples() {
        Expression expr = new AddExpression(
                new NumberExpression(2),
                new NumberExpression(3)
        );

        assertEquals(5, expr.interpret());
    }

    @Test
    void deveInterpretarExpressaoComposta() {
        Expression expr = new SubtractExpression(
                new AddExpression(
                        new NumberExpression(10),
                        new NumberExpression(5)
                ),
                new NumberExpression(3)
        );

        assertEquals(12, expr.interpret());
    }
}