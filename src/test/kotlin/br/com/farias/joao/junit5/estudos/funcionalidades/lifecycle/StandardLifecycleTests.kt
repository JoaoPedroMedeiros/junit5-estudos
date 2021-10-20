package br.com.farias.joao.junit5.estudos.funcionalidades.lifecycle

import org.junit.jupiter.api.*
import kotlin.test.assertEquals

class StandardLifecycleTests {

    companion object {

        @BeforeAll
        @JvmStatic
        fun beforeAll() {
            println("Rodando antes de todos os testes, uma única vez")
        }

        @AfterAll
        @JvmStatic
        fun afterAll() {
            println("Rodando depois de todos os testes, uma única vez")
        }
    }


    @BeforeEach
    fun beforeEach() {
        println("Rodando antes de cada teste")
    }

    @Test
    fun succeedded() {
        println("Rodando teste com sucesso")
        assertEquals(2, 1 + 1)
    }

    @Test
    fun failed() {
        println("Rodando teste com falha")
        assertEquals(3, 1 + 1)
    }

    @AfterEach
    fun afterEach() {
        println("Rodando depois de cada teste")
    }
}