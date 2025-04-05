package com.paulo.desafioProgramador.desafios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Desafio04Test {

    private Desafio04 desafio04;

    @BeforeEach
    void setUp() {
        desafio04 = new Desafio04();
    }

    @Test
    void testOrdenacaoPorPrioridade() {
        List<Entrega> entregas = List.of(
                new Entrega("João", "Rua A", "normal", 10),
                new Entrega("Maria", "Rua B", "expressa", 5),
                new Entrega("Carlos", "Rua C", "expressa", 15),
                new Entrega("Ana", "Rua D", "normal", 3)
        );

        List<Entrega> ordenadas = desafio04.ordenarEntregasPorPrioridade(entregas);

        assertEquals("Maria", ordenadas.get(0).getDestinatario());
        assertEquals("Carlos", ordenadas.get(1).getDestinatario());
        assertEquals("Ana", ordenadas.get(2).getDestinatario());
        assertEquals("João", ordenadas.get(3).getDestinatario());
    }

    @Test
    void testListaVazia() {
        List<Entrega> ordenadas = desafio04.ordenarEntregasPorPrioridade(List.of());
        assertTrue(ordenadas.isEmpty());
    }

    @Test
    void testTodosMesmoTipo() {
        List<Entrega> entregas = List.of(
                new Entrega("Zé", "Rua X", "normal", 20),
                new Entrega("Lu", "Rua Y", "normal", 5)
        );

        List<Entrega> ordenadas = desafio04.ordenarEntregasPorPrioridade(entregas);

        assertEquals("Lu", ordenadas.get(0).getDestinatario());
        assertEquals("Zé", ordenadas.get(1).getDestinatario());
    }
}