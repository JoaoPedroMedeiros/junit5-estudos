package br.com.farias.joao.junit5.estudos.funcionalidades.lifecycle.callbacks

import br.com.farias.joao.junit5.estudos.funcionalidades.lifecycle.StandardLifecycleTests
import org.junit.jupiter.api.extension.AfterEachCallback
import org.junit.jupiter.api.extension.ExtensionContext

class AfterEachLogger : AfterEachCallback {

    override fun afterEach(context: ExtensionContext?) {
        StandardLifecycleTests().afterEach()
    }
}