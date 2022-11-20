package factoryPattern.ingredients.dough

class ThickCrustDough : Dough {
    override fun createDough() {
        println("Preparing thick crust dough")
    }
}