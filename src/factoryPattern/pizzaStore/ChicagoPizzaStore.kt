package factoryPattern.pizzaStore

import factoryPattern.ingredients.ChicagoPizzaIngredientFactory
import factoryPattern.pizza.ChicagoStylePizza.ChicagoStyleCheesePizza
import factoryPattern.pizza.ChicagoStylePizza.ChicagoStyleClamPizza
import factoryPattern.pizza.ChicagoStylePizza.ChicagoStylePepperoniPizza
import factoryPattern.pizza.ChicagoStylePizza.ChicagoStyleVeggiePizza
import factoryPattern.pizza.Pizza

class ChicagoPizzaStore : PizzaStore() {
    val ingredients = ChicagoPizzaIngredientFactory();

    override fun createPizza(type: String): Pizza? {
        when(type) {
            "cheese" -> return ChicagoStyleCheesePizza(ingredients);
            "clam" -> return ChicagoStyleClamPizza(ingredients);
            "pepperoni" -> return ChicagoStylePepperoniPizza(ingredients);
            "veggie" -> return ChicagoStyleVeggiePizza(ingredients)
        }
        return null;
    }

}