package factoryPattern.pizza.NYStylePizza

import factoryPattern.ingredients.PizzaIngredientFactory
import factoryPattern.pizza.Pizza

class NYStyleVeggiePizza(override var ingredientFactory: PizzaIngredientFactory) : Pizza {
    override fun prepare() {
        println("Preparing NYStyleVeggiePizza")

        ingredientFactory.createDough().createDough();
        ingredientFactory.createSauce().createSauce();
        ingredientFactory.createVeggies().forEach { veggie -> veggie.createVeggies() }
        ingredientFactory.createCheese().createCheese();
    }

    override fun bake() {
        println("Baking NYStyleVeggiePizza")
    }

    override fun deliver() {
        println("Delivering NYStyleVeggiePizza")
    }
}