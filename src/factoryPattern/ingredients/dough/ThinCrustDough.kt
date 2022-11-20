package factoryPattern.ingredients.dough

class ThinCrustDough : Dough {
    override fun createDough() {
        println("Preparing thin crust dough")
    }
}