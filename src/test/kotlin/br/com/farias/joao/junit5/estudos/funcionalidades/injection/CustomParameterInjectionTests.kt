package br.com.farias.joao.junit5.estudos.funcionalidades.injection

import br.com.farias.joao.junit5.estudos.funcionalidades.injection.resolvers.Empresa
import br.com.farias.joao.junit5.estudos.funcionalidades.injection.resolvers.EmpresaParameterResolver
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@ExtendWith(EmpresaParameterResolver::class)
class CustomParameterInjectionTests {

    @Test
    fun a(empresa: Empresa) {
        println(empresa)
        assertEquals("12345", empresa.cnpj)
        assertTrue { empresa.razaoSocial.contains("Matheus") }
    }
}