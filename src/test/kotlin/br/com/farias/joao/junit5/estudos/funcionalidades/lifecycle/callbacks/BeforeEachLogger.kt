package br.com.farias.joao.junit5.estudos.funcionalidades.lifecycle.callbacks

import br.com.farias.joao.junit5.estudos.funcionalidades.lifecycle.StandardLifecycleTests
import org.junit.jupiter.api.extension.BeforeEachCallback
import org.junit.jupiter.api.extension.ExtensionContext

class BeforeEachLogger : BeforeEachCallback {

    override fun beforeEach(context: ExtensionContext) {
        StandardLifecycleTests().beforeEach()
    }
}