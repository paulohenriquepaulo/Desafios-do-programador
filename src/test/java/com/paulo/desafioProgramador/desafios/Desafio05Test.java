package com.paulo.desafioProgramador.desafios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class Desafio05Test {

    private Desafio05 desafio05;

    @BeforeEach
    void setUp() {
        desafio05 = new Desafio05();
    }

    @Test
    public void testPlacaValidaFormatoMercosul() {
        assertTrue(desafio05.placaValida("ABC1D23"));
        assertTrue(desafio05.placaValida("QWE9Z87"));
    }

    @Test
    public void testPlacaInvalidaMinusculas() {
        assertFalse(desafio05.placaValida("abc1d23"));
    }

    @Test
    public void testPlacaInvalidaFormatoAntigo() {
        assertFalse(desafio05.placaValida("ABC1234"));
    }

    @Test
    public void testPlacaComCaracteresInvalidos() {
        assertFalse(desafio05.placaValida("A@C1D23"));
    }

    @Test
    public void testPlacaComTamanhoIncorreto() {
        assertFalse(desafio05.placaValida("AB1D2"));
        assertFalse(desafio05.placaValida("ABCD1234"));
    }

}