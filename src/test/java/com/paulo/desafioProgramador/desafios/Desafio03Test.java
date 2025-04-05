package com.paulo.desafioProgramador.desafios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class Desafio03Test {

    private Desafio03 desafio03;

    @BeforeEach
    void setUp() {
        desafio03 = new Desafio03();
    }

    @Test
    void testEntregaNormalComInicioNaSegunda() {
        LocalDate previsao = desafio03.calcularPrevisaoEntrega(LocalDate.of(2025, 4, 7), "normal");
        assertEquals(LocalDate.of(2025, 4, 14), previsao);
    }

    @Test
    void testEntregaExpressaComInicioNaSexta() {
        LocalDate previsao = desafio03.calcularPrevisaoEntrega(LocalDate.of(2025, 4, 11), "expressa");
        assertEquals(LocalDate.of(2025, 4, 15), previsao);
    }

    @Test
    void testEntregaNormalComInicioNaSexta() {
        LocalDate previsao = desafio03.calcularPrevisaoEntrega(LocalDate.of(2025, 4, 11), "normal");
        assertEquals(LocalDate.of(2025, 4, 18), previsao);
    }

    @Test
    void testEntregaComTipoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            desafio03.calcularPrevisaoEntrega(LocalDate.of(2025, 4, 11), "turbo");
        });
    }
}
