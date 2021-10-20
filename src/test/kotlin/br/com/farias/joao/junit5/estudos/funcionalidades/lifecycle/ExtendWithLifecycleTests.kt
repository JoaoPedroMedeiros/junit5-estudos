package br.com.farias.joao.junit5.estudos.funcionalidades.lifecycle

import br.com.farias.joao.junit5.estudos.funcionalidades.lifecycle.callbacks.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import kotlin.test.assertEquals

//@ExtendWith(
//    BeforeAllLogger::class,
//    AfterAllLogger::class,
//    BeforeEachLogger::class,
//    AfterEachLogger::class
//)
@JUnit5LifecycleLogger
class ExtendWithLifecycleTests {

    @Test
    fun succeedded() {
        assertEquals(2, 1 + 1)
    }

    @Test
    fun failed() {
        assertEquals(3, 1 + 1)
    }
}