package methodTemplatePattern.withoutHooks

class Tea : CaffeineBeverage() {
    override fun brew() {
        println("Steeping the tea")
    }
}