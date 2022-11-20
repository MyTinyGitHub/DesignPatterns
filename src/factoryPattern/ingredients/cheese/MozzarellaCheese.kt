package factoryPattern.ingredients.cheese

class MozzarellaCheese : Cheese {
    override fun createCheese() {
        println("Preparing mozzarella cheese")
    }
}