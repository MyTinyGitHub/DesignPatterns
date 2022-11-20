package factoryPattern.ingredients.cheese

class ReggianoCheese : Cheese {
    override fun createCheese() {
        println("Preparing reggiano cheese")
    }
}