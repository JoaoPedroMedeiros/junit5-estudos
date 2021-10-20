package br.com.farias.joao.junit5.estudos.funcionalidades.injection

import org.junit.jupiter.api.*
import kotlin.test.assertEquals

class TestInfoTests {

    @BeforeEach
    fun beforeEach(testInfo: TestInfo) {
        println(testInfo.displayName)
    }

    @Test
    @DisplayName("Teste maroto do Joao")
    @Tag("maroto")
    fun xxxxxx(testInfo: TestInfo) {
        println(testInfo.displayName)
        println(testInfo.tags)
    }

    @Test
    fun testar2() {
        assertEquals(1, 2)
    }
}