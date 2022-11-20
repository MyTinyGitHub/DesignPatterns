package strategyPattern.squawk

open class NormalSquawk : SquawkBehaviour {

    override fun makeNoise() {
        println("Squawk!");
    }
}