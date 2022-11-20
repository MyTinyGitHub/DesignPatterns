package methodTemplatePattern.withoutHooks

abstract class CaffeineBeverage {
    final fun prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract fun brew();

    fun pourInCup() {
        println("Pouring into cup")
    }

    fun boilWater() {
        println("Boiling watter")
    }

    fun addCondiments() {
        println("No Condiments added")
    }
}