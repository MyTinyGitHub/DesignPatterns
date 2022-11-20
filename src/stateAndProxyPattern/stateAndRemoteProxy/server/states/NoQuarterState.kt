package stateAndProxyPattern.stateAndRemoteProxy.server.states

import stateAndProxyPattern.stateAndRemoteProxy.server.GumballMachine

class NoQuarterState ( @Transient private val gumballMachine: GumballMachine) : StateImp() {
    override fun insertQuarter() {
        println("Inserting a coin")
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    companion object {
        private const val serialVersionUID: Long = 123
    }
}