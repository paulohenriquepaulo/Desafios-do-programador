package com.paulo.desafioProgramador.desafios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Desafio01Test {

    private Desafio01 escadaObj;

    @BeforeEach
    void setUp() {
        escadaObj = new Desafio01();
    }

    @Test
    void testEscadaTamanho1() {
        String resultado = escadaObj.escada(1);
        StringBuilder esperado = new StringBuilder("*\n");
        assertEquals(esperado.toString(), resultado);
    }

    @Test
    void testEscadaTamanho4() {
        String resultado = escadaObj.escada(4);
        StringBuilder esperado = new StringBuilder()
                .append("   *\n")
                .append("  **\n")
                .append(" ***\n")
                .append("****\n");
        assertEquals(esperado.toString(), resultado);
    }

    @Test
    void testEscadaTamanho6() {
        String resultado = escadaObj.escada(6);
        StringBuilder esperado = new StringBuilder()
                .append("     *\n")
                .append("    **\n")
                .append("   ***\n")
                .append("  ****\n")
                .append(" *****\n")
                .append("******\n");
        assertEquals(esperado.toString(), resultado);
    }
}
