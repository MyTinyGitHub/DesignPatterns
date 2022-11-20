package stateAndProxyPattern.stateAndRemoteProxy.server

import java.rmi.registry.LocateRegistry

fun main() {
    var gumballMachine: GumballMachineRemote

    gumballMachine = GumballMachine(5, "127.0.0.1");
    val registry = LocateRegistry.createRegistry(5999)
    registry.rebind("gumballMachine", gumballMachine);
}