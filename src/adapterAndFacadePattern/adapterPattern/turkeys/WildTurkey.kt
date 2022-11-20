package adapterAndFacadePattern.adapterPattern.turkeys

class WildTurkey : Turkey {
    override fun gobble() {
        println("Gobble Gobble")
    }

    override fun fly() {
        println("Fly short distance")
    }
}