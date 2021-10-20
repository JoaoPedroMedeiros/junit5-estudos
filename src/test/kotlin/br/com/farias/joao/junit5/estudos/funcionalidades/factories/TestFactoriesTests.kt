package br.com.farias.joao.junit5.estudos.funcionalidades.factories

import org.junit.jupiter.api.DynamicContainer
import org.junit.jupiter.api.DynamicNode
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertTrue

class TestFactoriesTests {

//    @TestFactory
//    fun factory(): List<DynamicNode> =
//        listOf(
//            DynamicTest.dynamicTest("Teste 1") { assertTrue { true } },
//            DynamicTest.dynamicTest("Teste 2") { assertTrue { false } }
//        )

    @TestFactory
    fun factory2(): List<DynamicNode> =
        listOf(
            DynamicContainer.dynamicContainer("Grupo de testes 1", listOf(
                DynamicTest.dynamicTest("Teste 1") { assertTrue { true } },
                DynamicTest.dynamicTest("Teste 2") { assertTrue { false } }
            )),
            DynamicContainer.dynamicContainer("Grupo de testes 2", listOf(
                DynamicTest.dynamicTest("Teste 3") { assertTrue { true } },
                DynamicTest.dynamicTest("Teste 4") { assertTrue { false } }
            ))
        )
}