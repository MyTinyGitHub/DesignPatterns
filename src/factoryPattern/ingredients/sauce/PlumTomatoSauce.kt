package factoryPattern.ingredients.sauce

class PlumTomatoSauce : Sauce {
    override fun createSauce() {
        println("Preparing plum tomato sauce")
    }
}