package br.com.farias.joao.junit5.estudos.funcionalidades.parameterized

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EmptySource
import org.junit.jupiter.params.provider.NullSource
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertTrue

class ValueSourceTests {

//    @DisplayName("Value source de buenas")
//    @ParameterizedTest
//    @ValueSource(strings = ["batata", "cenoura", "abacate", "mixirica"])
//    fun valueSourceTest(comida: String) {
//        println(comida)
//        assertTrue { comida.contains("a") && comida.contains("t") }
//    }

    @DisplayName("Value source agressivo")
    @ParameterizedTest
    @ValueSource(strings = ["batata", "cenoura", "abacate", "mixirica"])
    @NullSource
    @EmptySource
    fun valueSourceTestWithAlternativeValues(comida: String) {
        println(comida)
        assertTrue { comida.contains("a") && comida.contains("t") }
    }
}