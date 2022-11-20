package adapterAndFacadePattern.adapterPattern

import adapterAndFacadePattern.adapterPattern.turkeys.Turkey
import strategyPattern.ducks.Duck
import java.util.*

class DuckToTurkeyAdapter(var duck : Duck) : Turkey {
    private val random = Random();

    override fun gobble() {
        duck.squawk();
    }

    override fun fly() {
        if(random.nextInt() % 5 == 0) {
            duck.fly();
        }
    }
}