package factoryPattern.pizza.NYStylePizza

import factoryPattern.ingredients.PizzaIngredientFactory
import factoryPattern.pizza.Pizza

class NYStyleClamPizza(override var ingredientFactory: PizzaIngredientFactory) : Pizza {
    override fun prepare() {
        println("Preparing NYStyleClamPizza")

        ingredientFactory.createCheese().createCheese();
        ingredientFactory.createClam().createClams();
        ingredientFactory.createDough().createDough();
    }

    override fun bake() {
        println("Baking NYStyleClamPizza")
    }

    override fun deliver() {
        println("Delivering NYStyleClamPizza")
    }
}