package stateAndProxyPattern.stateAndRemoteProxy.server

import stateAndProxyPattern.stateAndRemoteProxy.server.states.State
import java.rmi.Remote
import java.rmi.RemoteException

interface GumballMachineRemote : Remote {
    @Throws(RemoteException::class)
    public fun getCount() : Int;
    @Throws(RemoteException::class)
    public fun getLocation() : String;
    @Throws(RemoteException::class)
    public fun getState() : State;
}