package strategyPattern

import strategyPattern.ducks.DuckDecoy

fun main() {
    val duck = DuckDecoy();

    duck.fly();
    duck.squawk();
}
