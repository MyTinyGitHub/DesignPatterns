package methodTemplatePattern.withoutHooks


fun main() {
    val tea : CaffeineBeverage = Tea();
    val coffee : CaffeineBeverage = Coffee();

    tea.prepareRecipe();
    println()
    coffee.prepareRecipe();
}