package br.com.farias.joao.junit5.estudos.funcionalidades.parameterized

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertTrue

class MethodSourceMultiArgumentTests {

    @ParameterizedTest
    @MethodSource("coisasDoMeuQuarto")
    fun methodSource(coisa: String, quantidade: Int) {
        assertTrue { quantidade > 2 }
    }

    companion object {

        @JvmStatic
        fun coisasDoMeuQuarto(): Stream<Arguments> =
            listOf(
                Arguments.of("Violão", 1),
                Arguments.of("Notebook", 1),
                Arguments.of("Livro", 10000),
                Arguments.of("Cadeira", 2),
                Arguments.of("Roupa suja", 800)
            ).stream()
    }
}