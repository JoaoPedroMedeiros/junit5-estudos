package br.com.farias.joao.junit5.estudos.funcionalidades.lifecycle.callbacks

import br.com.farias.joao.junit5.estudos.funcionalidades.lifecycle.StandardLifecycleTests
import org.junit.jupiter.api.extension.BeforeAllCallback
import org.junit.jupiter.api.extension.ExtensionContext

class BeforeAllLogger : BeforeAllCallback {

    override fun beforeAll(context: ExtensionContext?) {
        StandardLifecycleTests.beforeAll()
    }
}