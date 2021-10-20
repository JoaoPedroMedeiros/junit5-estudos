package br.com.farias.joao.junit5.estudos.funcionalidades.parameterized

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource

class CsvFileSourceTests {

    @CsvFileSource(resources = ["/coisas_da_cozinha.csv"])
    @ParameterizedTest
    fun csv(coisa: String, quantidade: Int) {
        println(coisa)
        println(quantidade)
    }
}