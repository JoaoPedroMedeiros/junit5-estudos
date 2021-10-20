package br.com.farias.joao.junit5.estudos.funcionalidades.assertions

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 * Aqui estão algumas opções de assertions pelo JUnit 5,
 * entretanto, a própria documentação diz que o foco deles
 * não é oferecer uma biblioteca completa de assertions.
 * Em caso de maior necessidade, a documentação recomenda
 * utilizada bibliotecas como AssertJ, Hamcrest ou Truth.
 */
class AssertionsTests {

    @Test
    fun standardAssertions() {
        val joao = Pessoa("João", 24)

        // Sem mensagem opcional
        assertEquals("João Pedro", joao.nome)

        // Com mensagem opcional
        assertEquals(25, joao.idade, "Mensagem opcional quando o João não tem a idade correta")

        // Com mensagem opcional (lazy)
        assertEquals(25, joao.idade) {
            "Mensagem opcional quando o João não tem a idade correta"
        }
    }

    @Test
    fun groupedAssertions() {
        val joao = Pessoa("João", 24)

        assertAll(
            "Pessoa",
            { assertEquals("João Pedro", joao.nome) },
            { assertEquals(25, joao.idade) },
        )
    }

    @Test
    fun dependentAssertions() {
        val joao = Pessoa("João", 24)

        assertAll(
            "Pessoa",
            {
                assertNotNull(joao.nome)
                assertAll(
                    "nome",
                    { assertTrue(joao.nome.startsWith("j"), "Deveria começar com J") },
                    { assertTrue(joao.nome.endsWith("O"), "Deveria terminar com a") },
                )
            },
            {
                assertNotNull(joao.idade)
                assertAll(
                    "idade",
                    { assertTrue(joao.idade.toDouble() / 2 != 0.0, "Não poderia ser múltiplo de 2") },
                    { assertTrue(joao.idade.toDouble() / 5 == 0.0, "Deveria ser múltiplo de 5") },
                )
            },
        )
    }

    @Test
    fun exceptionTesting() {
        val exception: Exception = assertThrows(ArithmeticException::class.java) { 1 / 0 }
        assertEquals("/ by zero", exception.message)
    }
}

private data class Pessoa(val nome: String, val idade: Int)