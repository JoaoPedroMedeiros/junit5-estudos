package br.com.farias.joao.junit5.estudos.funcionalidades.assumptions

import org.junit.jupiter.api.Assumptions
import kotlin.test.Test
import kotlin.test.assertEquals

class AssumptionTest {

    @Test
    fun testarSomenteSeEstiverComJDK() {
        Assumptions.assumeTrue { System.getenv("JAVA_HOME").contains("jdk") }
        assertEquals(1, 2)
    }

    @Test
    fun testarDiferenteDependendoDaJdk() {
        Assumptions.assumingThat(System.getenv("JAVA_HOME").contains("jre")) {
            assertEquals(1, 2)
        }
        assertEquals(2, 3)
    }
}