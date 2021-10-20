package br.com.farias.joao.junit5.estudos.funcionalidades.repeated

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.RepeatedTest
import org.junit.jupiter.api.RepetitionInfo
import kotlin.test.assertTrue

class RepeatedTests {

//    @RepeatedTest(10, name = RepeatedTest.LONG_DISPLAY_NAME)
//    @DisplayName("Sempre errado")
//    fun repeatedTest() {
//        assertEquals(1, 2)
//    }

//    @RepeatedTest(10, name = RepeatedTest.LONG_DISPLAY_NAME)
//    @DisplayName("Quase sempre errado")
//    fun repeatedTestRepetitionInfo(repetitionInfo: RepetitionInfo) {
//        println(repetitionInfo.currentRepetition.toDouble() % 2.0)
//        assertTrue { repetitionInfo.currentRepetition.toDouble() % 2.0 == 0.0 }
//    }

    @RepeatedTest(10, name = "{displayName} {currentRepetition} de {totalRepetitions} dahora")
    @DisplayName("Nome customizado")
    fun nomeCustomizado(repetitionInfo: RepetitionInfo) {
        println(repetitionInfo.currentRepetition.toDouble() % 2.0)
        assertTrue { repetitionInfo.currentRepetition.toDouble() % 2.0 == 0.0 }
    }
}