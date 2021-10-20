package br.com.farias.joao.junit5.estudos.funcionalidades.tags

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Timeout
import kotlin.test.assertEquals

/**
 * Rodando com as tags no Maven
 *
 * mvn test -Dgroups="fast"
 *
 * <plugin>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>${maven-surefire-plugin.version}</version>
        <configuration>
            <!-- Include tags -->
            <groups>slow | fast</groups>
        </configuration>
    </plugin>
 *
 *
 */
class TagsTests {

    @Test
    @Tag("slow")
    fun `teste normal anotado como slow`() {
        assertEquals(2, 1 + 1)
    }

    @Test
    @Tag("fast")
    fun `teste normal anotado como fast`() {
        assertEquals(2, 1 + 1)
    }

    @FastTest
    fun `teste rapido`() {
        assertEquals(2, 1 + 1)
    }

    @SlowTest
    fun `teste lento`() {
        assertEquals(2, 1 + 1)
    }
}