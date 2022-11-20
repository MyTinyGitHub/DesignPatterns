package factoryPattern.pizza.ChicagoStylePizza

import factoryPattern.ingredients.PizzaIngredientFactory
import factoryPattern.pizza.Pizza

class ChicagoStyleCheesePizza(override var ingredientFactory: PizzaIngredientFactory) : Pizza {
    override fun prepare() {
        println("Preparing ChicagoStyleCheesePizza")

        ingredientFactory.createDough().createDough();
        ingredientFactory.createSauce().createSauce();
        ingredientFactory.createCheese().createCheese();
    }

    override fun bake() {
        println("Baking ChicagoStyleCheesePizza")
    }

    override fun deliver() {
        println("Delivering ChicagoStyleCheesePizza")
    }
}