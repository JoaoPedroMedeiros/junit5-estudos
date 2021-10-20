package br.com.farias.joao.junit5.estudos.funcionalidades.parameterized

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertTrue

class MethodSourceTests {

    @ParameterizedTest
    @MethodSource("coisasDoMeuQuarto")
    fun methodSource(coisa: String) {
        assertTrue { coisa.contains("a") }
    }

    companion object {

        @JvmStatic
        fun coisasDoMeuQuarto(): Stream<String> =
            listOf("Violão", "Notebook", "Livro", "Cadeira", "Roupa suja").stream()
    }
}