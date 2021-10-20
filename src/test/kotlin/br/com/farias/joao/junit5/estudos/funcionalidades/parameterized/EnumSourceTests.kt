package br.com.farias.joao.junit5.estudos.funcionalidades.parameterized

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import org.junit.jupiter.params.provider.NullSource
import kotlin.test.assertTrue

class EnumSourceTests {

    @ParameterizedTest
    @EnumSource(Coisas::class)
    @NullSource
    fun coisas(coisa: Coisas?) {
        assertTrue { coisa?.algo?.contains("a") ?: false }
    }
}

enum class Coisas(val algo: String) {
    CAMISETA("bonita"),
    SHORTS("curto"),
    FERRADURA("pesada"),
    ABELHA("melzeira"),
    ORELHA("suja")
}