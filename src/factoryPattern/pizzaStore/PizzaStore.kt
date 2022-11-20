package factoryPattern.pizzaStore

import factoryPattern.pizza.Pizza

abstract class PizzaStore {
    protected abstract fun createPizza(type : String) : Pizza?;

    fun orderPizza(type: String) {
        val pizza : Pizza? = this.createPizza(type);
        pizza?.prepare();
        pizza?.bake();
        pizza?.deliver();
    }
}