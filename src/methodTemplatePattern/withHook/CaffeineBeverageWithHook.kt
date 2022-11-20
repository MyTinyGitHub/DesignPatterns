package methodTemplatePattern.withHook

abstract class CaffeineBeverageWithHook {

    final fun prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract fun brew();
    abstract fun addCondiments()

    fun pourInCup() {
        println("Pouring into cup")
    }

    fun boilWater() {
        println("Boiling watter")
    }

    open fun customerWantsCondiments(): Boolean {
        return true;
    }
}