package factoryPattern.ingredients.veggies

class EggPlant : Veggies {
    override fun createVeggies() {
        println("Preparing egg plant")
    }
}