package stateAndProxyPattern.stateAndRemoteProxy.client

import stateAndProxyPattern.stateAndRemoteProxy.server.GumballMachineRemote
import java.rmi.Naming

fun main() {
    val machine = Naming.lookup("rmi://127.0.0.1:5999/gumballMachine") as GumballMachineRemote
    val monitor = GumballMonitor(machine)
    monitor.report()
}