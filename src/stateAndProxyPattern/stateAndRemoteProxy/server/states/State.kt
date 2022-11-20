package stateAndProxyPattern.stateAndRemoteProxy.server.states

interface State : java.io.Serializable {
    public fun insertQuarter();
    public fun ejectQuarter();
    public fun turnCrank();
    public fun dispense();
}