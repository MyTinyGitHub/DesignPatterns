package factoryPattern.pizza

import factoryPattern.ingredients.PizzaIngredientFactory

interface Pizza {
    var ingredientFactory: PizzaIngredientFactory

    fun prepare();
    fun bake();
    fun deliver();
}