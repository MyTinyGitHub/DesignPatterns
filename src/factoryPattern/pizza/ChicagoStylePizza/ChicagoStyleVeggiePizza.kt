package factoryPattern.pizza.ChicagoStylePizza

import factoryPattern.ingredients.PizzaIngredientFactory
import factoryPattern.pizza.Pizza

class ChicagoStyleVeggiePizza(override var ingredientFactory: PizzaIngredientFactory) : Pizza {
    override fun prepare() {
        println("Preparing ChicagoStyleVeggiePizza")

        ingredientFactory.createDough().createDough();
        ingredientFactory.createSauce().createSauce();
        ingredientFactory.createVeggies().forEach { veggie -> veggie.createVeggies() }
        ingredientFactory.createCheese().createCheese();
    }

    override fun bake() {
        println("Baking ChicagoStyleVeggiePizza")
    }

    override fun deliver() {
        println("Delivering ChicagoStyleVeggiePizza")
    }

}