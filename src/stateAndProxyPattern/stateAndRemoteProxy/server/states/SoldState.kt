package stateAndProxyPattern.stateAndRemoteProxy.server.states

import stateAndProxyPattern.stateAndRemoteProxy.server.GumballMachine

class SoldState( @Transient private val gumballMachine: GumballMachine) : StateImp() {
    override fun dispense() {
        println("Dispensing the gum ball")
        gumballMachine.setState(gumballMachine.getNoQuarterState())
    }

    companion object {
        private const val serialVersionUID: Long = 123
    }
}