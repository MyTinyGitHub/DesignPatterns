package methodTemplatePattern.withHook

fun main() {
    val coffee : CaffeineBeverageWithHook = CoffeeWithHook();
    val tea : CaffeineBeverageWithHook = TeaWithHook();

    coffee.prepareRecipe()
    println()
    tea.prepareRecipe()
}