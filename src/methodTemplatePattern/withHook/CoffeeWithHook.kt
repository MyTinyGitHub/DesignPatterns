package methodTemplatePattern.withHook

class CoffeeWithHook : CaffeineBeverageWithHook() {
    override fun brew() {
        println("Dripping Coffee through filter")
    }

    override fun addCondiments() {
        println("Adding sugar and milk")
    }

    override fun customerWantsCondiments() : Boolean {
        return true;
    }
}