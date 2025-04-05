package com.paulo.desafioProgramador.desafios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Desafio02Test {

    private Desafio02 desafio02;

    @BeforeEach
    void setUp() {
        desafio02 = new Desafio02();
    }

    @Test
    void testFreteNormalSemDesconto() {
        double valor = desafio02.calcularFrete(50, "normal");
        assertEquals(50.00, valor, 0.01);
    }


    @Test
    void testFreteExpressaSemDesconto() {
        double valor = desafio02.calcularFrete(80, "expressa");
        assertEquals(120.00, valor, 0.01);
    }

    @Test
    void testFreteNormalComDesconto() {
        double valor = desafio02.calcularFrete(120, "normal");
        assertEquals(114.00, valor, 0.01);
    }

    @Test
    void testFreteExpressaComDesconto() {
        double valor = desafio02.calcularFrete(200, "expressa");
        assertEquals(285.00, valor, 0.01);
    }

    @Test
    void testTipoEntregaInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            desafio02.calcularFrete(100, "urgente");
        });
    }
}
