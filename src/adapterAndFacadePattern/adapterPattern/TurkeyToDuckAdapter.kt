package adapterAndFacadePattern.adapterPattern

import adapterAndFacadePattern.adapterPattern.turkeys.Turkey
import strategyPattern.ducks.Duck

class TurkeyToDuckAdapter(var turkey : Turkey) : Duck {
    override fun squawk() {
        turkey.gobble();
    }

    override fun fly() {
        turkey.fly()
        turkey.fly()
        turkey.fly()
        turkey.fly()
        turkey.fly()
    }
}