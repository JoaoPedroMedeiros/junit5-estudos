package br.com.farias.joao.junit5.estudos.funcionalidades

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.*
import kotlin.test.assertEquals

class EnableOrDisableTests {

    @Test
    @Disabled("Não executado porque eu não quero")
    fun `testar se nunca executa`() {
        assertEquals(1, 2)
    }

    @Test
    @EnabledOnOs(value = [OS.LINUX])
    fun `testar se executa somente no linux`() {
        assertEquals(1, 2)
    }

    @Test
    @EnabledOnOs(value = [OS.WINDOWS])
    fun `testar se executa somente no windows`() {
        assertEquals(1, 2)
    }

    @Test
    @DisabledOnOs(value = [OS.WINDOWS])
    fun `testar se nao executa no windows`() {
        assertEquals(1, 2)
    }

    @Test
    @DisabledOnOs(value = [OS.LINUX])
    fun `testar se nao executa no linux`() {
        assertEquals(1, 2)
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    fun `testar se executa no Java 8`() {
        assertEquals(1, 2)
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_11)
    fun `testar se executa no range Java 8 e Java 11`() {
        assertEquals(1, 2)
    }

    @Test
    @EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
    fun `testar se executa somente para SO x64`() {
        assertEquals(1, 2)
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "JAVA_HOME", matches = "C:.*")
    fun `testar se nao executa pra quem tem java instalado no disco C`() {
        assertEquals(1, 2)
    }
}