package methodTemplatePattern.withoutHooks

class Coffee : CaffeineBeverage() {
    override fun brew() {
        println("Dripping Coffee through filter")
    }
}