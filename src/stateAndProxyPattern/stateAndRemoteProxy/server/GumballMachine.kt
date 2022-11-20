package stateAndProxyPattern.stateAndRemoteProxy.server

import stateAndProxyPattern.stateAndRemoteProxy.server.states.HasQuarterState
import stateAndProxyPattern.stateAndRemoteProxy.server.states.NoQuarterState
import stateAndProxyPattern.stateAndRemoteProxy.server.states.SoldState
import stateAndProxyPattern.stateAndRemoteProxy.server.states.State
import java.rmi.server.UnicastRemoteObject


class GumballMachine(private var count: Int, private val location: String) : UnicastRemoteObject(),
    GumballMachineRemote {
    private val hasQuarterState = HasQuarterState(this);
    private val noQuarterState = NoQuarterState(this);
    private val soldState = SoldState(this);

    private var state : State = noQuarterState;

    override fun getCount(): Int {
        return count;
    }
    override fun getLocation(): String {
        return location;
    }
    override fun getState(): State {
        return state;
    }

    public fun insertQuarter() {
        state.insertQuarter();
    }

    public fun turnCrank() {
        state.turnCrank();
    }

    public fun dispense() {
        state.dispense();
    }

    public fun setState(state : State) {
        this.state = state;
    }

    public fun getHasQuarterState() : State {
        return hasQuarterState;
    }

    public fun getNoQuarterState() : State {
        return noQuarterState;
    }

    public fun getSoldState() : State {
        return soldState;
    }

    companion object {
        private const val serialVersionUID: Long = 123
    }
}