package br.com.farias.joao.junit5.estudos.funcionalidades.lifecycle.callbacks

import org.junit.jupiter.api.extension.ExtendWith

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@ExtendWith(
    BeforeAllLogger::class,
    AfterAllLogger::class,
    BeforeEachLogger::class,
    AfterEachLogger::class
)
annotation class JUnit5LifecycleLogger()
