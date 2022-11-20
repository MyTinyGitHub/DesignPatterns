package factoryPattern.pizza.ChicagoStylePizza

import factoryPattern.ingredients.PizzaIngredientFactory
import factoryPattern.pizza.Pizza

class ChicagoStylePepperoniPizza(override var ingredientFactory: PizzaIngredientFactory) : Pizza {
    override fun prepare() {
        println("Preparing ChicagoStylePepperoniPizza")

        ingredientFactory.createDough().createDough();
        ingredientFactory.createSauce().createSauce();
        ingredientFactory.createCheese().createCheese();
        ingredientFactory.createPepperoni().createPepperoni();
    }

    override fun bake() {
        println("Baking ChicagoStylePepperoniPizza")
    }

    override fun deliver() {
        println("Delivering ChicagoStylePepperoniPizza")
    }
}