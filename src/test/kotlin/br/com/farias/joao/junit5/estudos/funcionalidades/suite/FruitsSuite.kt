package br.com.farias.joao.junit5.estudos.funcionalidades.suite

import br.com.farias.joao.junit5.estudos.funcionalidades.suite.foods.BananaTest
import br.com.farias.joao.junit5.estudos.funcionalidades.suite.foods.BatataTest
import org.junit.platform.suite.api.SelectClasses
import org.junit.platform.suite.api.Suite
import org.junit.platform.suite.api.SuiteDisplayName

@Suite
@SuiteDisplayName("Suite de testes das frutas")
//@SelectPackages("br.com.farias.joao.junit5.estudos.funcionalidades.suite.foods")
@SelectClasses(BatataTest::class, BananaTest::class)
class FoodsSuite