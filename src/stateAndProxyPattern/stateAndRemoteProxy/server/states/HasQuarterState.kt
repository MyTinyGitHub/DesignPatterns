package stateAndProxyPattern.stateAndRemoteProxy.server.states

import stateAndProxyPattern.stateAndRemoteProxy.server.GumballMachine

class HasQuarterState( @Transient private val gumballMachine: GumballMachine) : StateImp() {
    override fun turnCrank() {
        println("Turning the crank, wait for your ball")
        gumballMachine.setState(gumballMachine.getSoldState())
    }

    companion object {
        private const val serialVersionUID: Long = 123
    }
}