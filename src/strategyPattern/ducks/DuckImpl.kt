package strategyPattern.ducks

import strategyPattern.fly.FlyBehaviour
import strategyPattern.squawk.SquawkBehaviour

open class DuckImpl(var squawkBehaviour : SquawkBehaviour, var flyBehaviour: FlyBehaviour) : Duck {

    override fun squawk() {
        squawkBehaviour.makeNoise();
    }

    override fun fly() {
        flyBehaviour.fly();
    }
}