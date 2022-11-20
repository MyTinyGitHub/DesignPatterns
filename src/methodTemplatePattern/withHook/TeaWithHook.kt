package methodTemplatePattern.withHook

class TeaWithHook : CaffeineBeverageWithHook() {
    override fun brew() {
        println("Steeping the tea")
    }

    override fun addCondiments() {
        println("Adding milk")
    }

    override fun customerWantsCondiments(): Boolean {
        return false;
    }
}