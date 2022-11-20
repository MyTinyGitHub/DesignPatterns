package factoryPattern.ingredients.sauce

class MarinaraSauce : Sauce {
    override fun createSauce() {
        println("Preparing marinara sauce")
    }
}