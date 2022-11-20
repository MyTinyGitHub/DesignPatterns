package factoryPattern.pizza.ChicagoStylePizza

import factoryPattern.ingredients.PizzaIngredientFactory
import factoryPattern.pizza.Pizza

class ChicagoStyleClamPizza(override var ingredientFactory: PizzaIngredientFactory) : Pizza {
    override fun prepare() {
        println("Preparing ChicagoStyleClamPizza")

        ingredientFactory.createDough().createDough();
        ingredientFactory.createSauce().createSauce();
        ingredientFactory.createClam().createClams();
    }

    override fun bake() {
        println("Baking ChicagoStyleClamPizza")
    }

    override fun deliver() {
        println("Delivering ChicagoStyleClamPizza")
    }
}