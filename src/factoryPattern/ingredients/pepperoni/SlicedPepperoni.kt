package factoryPattern.ingredients.pepperoni

class SlicedPepperoni : Pepperoni {
    override fun createPepperoni() {
        println("Preparing sliced pepperoni")
    }
}