package br.com.farias.joao.junit5.estudos.funcionalidades.injection.resolvers

import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.api.extension.ParameterContext
import org.junit.jupiter.api.extension.ParameterResolver

class EmpresaParameterResolver : ParameterResolver {

    override fun supportsParameter(parameterContext: ParameterContext, extensionContext: ExtensionContext): Boolean = true

    override fun resolveParameter(parameterContext: ParameterContext, extensionContext: ExtensionContext): Empresa =
        Empresa("12345", "Empresa do Matheus")
}

data class Empresa(val cnpj: String, val razaoSocial: String)