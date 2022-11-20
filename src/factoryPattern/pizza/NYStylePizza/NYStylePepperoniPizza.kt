package factoryPattern.pizza.NYStylePizza

import factoryPattern.ingredients.PizzaIngredientFactory
import factoryPattern.pizza.Pizza

class NYStylePepperoniPizza(override var ingredientFactory: PizzaIngredientFactory) : Pizza {
    override fun prepare() {
        println("Preparing NYStylePepperoniPizza")

        ingredientFactory.createDough().createDough();
        ingredientFactory.createSauce().createSauce();
        ingredientFactory.createPepperoni().createPepperoni();
        ingredientFactory.createCheese().createCheese();
    }

    override fun bake() {
        println("Baking NYStylePepperoniPizza")
    }

    override fun deliver() {
        println("Delivering NYStylePepperoniPizza")
    }
}