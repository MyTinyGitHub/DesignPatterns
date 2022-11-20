package factoryPattern.pizzaStore

import factoryPattern.ingredients.NYPizzaIngredientFactory
import factoryPattern.pizza.NYStylePizza.NYStyleCheesePizza
import factoryPattern.pizza.NYStylePizza.NYStyleClamPizza
import factoryPattern.pizza.NYStylePizza.NYStylePepperoniPizza
import factoryPattern.pizza.NYStylePizza.NYStyleVeggiePizza
import factoryPattern.pizza.Pizza

class NYPizzaStore : PizzaStore() {
    val ingredients = NYPizzaIngredientFactory();

    override fun createPizza(type : String) : Pizza? {
        when(type) {
            "cheese" -> return NYStyleCheesePizza(ingredients);
            "clam" -> return NYStyleClamPizza(ingredients);
            "pepperoni" -> return NYStylePepperoniPizza(ingredients);
            "veggie" -> return NYStyleVeggiePizza(ingredients);
        }
        return null;
    }
}