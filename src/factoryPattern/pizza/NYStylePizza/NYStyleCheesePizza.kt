package factoryPattern.pizza.NYStylePizza

import factoryPattern.ingredients.PizzaIngredientFactory
import factoryPattern.pizza.Pizza

class NYStyleCheesePizza(override var ingredientFactory: PizzaIngredientFactory) : Pizza {
    override fun prepare() {
        println("Preparing NYStyleCheesePizza")

        ingredientFactory.createDough().createDough();
        ingredientFactory.createSauce().createSauce();
        ingredientFactory.createCheese().createCheese();
    }

    override fun bake() {
        println("Baking NYStyleCheesePizza")
    }

    override fun deliver() {
        println("Delivering NYStyleCheesePizza")
    }
}