package factoryPattern.ingredients.clams

class FrozenClams : Clams {
    override fun createClams() {
        println("Preparing frozen clams")
    }
}