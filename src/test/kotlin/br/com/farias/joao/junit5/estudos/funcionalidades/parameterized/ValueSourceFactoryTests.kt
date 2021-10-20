package br.com.farias.joao.junit5.estudos.funcionalidades.parameterized

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import java.io.File
import java.nio.charset.Charset
import java.time.LocalDate

/**
 * https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests-argument-conversion
 */
class ValueSourceFactoryTests {

    @ParameterizedTest
    @ValueSource(strings =  ["Seven Languages in seven weeks", "O clube de xadrez da morte", "Revolução dos bichos", "Admirável mundo novo"])
    fun valueSourceFactory(livro: Livro) {
        println(livro)
    }

    @ParameterizedTest
    @ValueSource(strings =  ["UTF-8"])
    fun valueSourceDefaultArgumentConverter(charset: Charset) {
        println(charset)
    }

    @ParameterizedTest
    @ValueSource(strings =  ["C:\\Program Files"])
    fun valueSourceDefaultArgumentConverter2(file: File) {
        println(file)
    }

    @ParameterizedTest
    @ValueSource(strings =  ["2021-01-05"])
    fun valueSourceDefaultArgumentConverter2(localDate: LocalDate) {
        println(localDate)
    }

}

data class Livro(val titulo: String) {

    companion object {

        @JvmStatic
        fun ofTitulo(titulo: String) = Livro(titulo)
    }
}