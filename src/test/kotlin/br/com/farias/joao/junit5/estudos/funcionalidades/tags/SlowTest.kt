package br.com.farias.joao.junit5.estudos.funcionalidades.tags

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@Tag("slow")
@Test
annotation class SlowTest()
