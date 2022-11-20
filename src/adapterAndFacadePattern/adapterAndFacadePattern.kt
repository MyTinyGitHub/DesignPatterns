package adapterAndFacadePattern

import adapterAndFacadePattern.adapterPattern.DuckToTurkeyAdapter
import adapterAndFacadePattern.adapterPattern.TurkeyToDuckAdapter
import adapterAndFacadePattern.adapterPattern.turkeys.Turkey
import adapterAndFacadePattern.adapterPattern.turkeys.WildTurkey
import adapterAndFacadePattern.facadePattern.HomeTheaterFacade
import strategyPattern.ducks.Duck
import strategyPattern.ducks.WildDuck

fun main() {
    runFacadePattern()
}

fun runFacadePattern() {
    val facade = HomeTheaterFacade();

    println("Watching movies")
    facade.watchMovie();

    println("\nTurning off the movies")
    facade.endMovie()

    println("\nListening to the radio")
    facade.listenToRadio()

    println("\nTurning off the radio")
    facade.endRadio()
}
fun runAdapterPattern() {
    var turkey : Turkey = WildTurkey();
    var duck : Duck = WildDuck();

    var duckAdapter = DuckToTurkeyAdapter(duck);
    var turkeyAdapter = TurkeyToDuckAdapter(turkey);

    println("Duck disguised as turkey")
    duckAdapter.gobble();
    duckAdapter.fly();

    println("\nTurkey disguised as duck")
    turkeyAdapter.squawk()
    turkeyAdapter.fly()
}