package br.com.farias.joao.junit5.estudos.funcionalidades.nested

import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class NestedTests {

    @Nested
    inner class Fluxo1 {

        @Test
        fun fluxo_1_1() {

        }

        @Test
        fun fluxo_1_2() {

        }

        @Nested
        inner class Fluxo1_3 {

            @Test
            fun fluxo_1_3_1() {

            }

            @Test
            fun fluxo_1_3_2() {

            }
        }
    }

    @Nested
    inner class Fluxo2 {

        @Test
        fun fluxo_2_1() {

        }

        @Test
        fun fluxo_2_2() {

        }
    }
}