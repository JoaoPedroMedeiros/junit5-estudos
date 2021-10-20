package br.com.farias.joao.junit5.estudos.funcionalidades.suite.foods

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BatataTest {

    @Test
    @Tag("CU")
    fun a() {
        assertEquals(1, 2)
    }
}