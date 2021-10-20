package br.com.farias.joao.junit5.estudos.funcionalidades.lifecycle.callbacks

import br.com.farias.joao.junit5.estudos.funcionalidades.lifecycle.StandardLifecycleTests
import org.junit.jupiter.api.extension.AfterAllCallback
import org.junit.jupiter.api.extension.ExtensionContext

class AfterAllLogger : AfterAllCallback {

    override fun afterAll(context: ExtensionContext) {
        StandardLifecycleTests.afterAll()
    }
}