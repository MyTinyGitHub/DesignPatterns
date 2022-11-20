package factoryPattern.ingredients

import factoryPattern.ingredients.cheese.Cheese
import factoryPattern.ingredients.clams.Clams
import factoryPattern.ingredients.dough.Dough
import factoryPattern.ingredients.pepperoni.Pepperoni
import factoryPattern.ingredients.sauce.Sauce
import factoryPattern.ingredients.veggies.Veggies

interface PizzaIngredientFactory {
    fun createDough() : Dough;
    fun createSauce() : Sauce;
    fun createCheese() : Cheese;
    fun createVeggies() : Array<Veggies>;
    fun createPepperoni() : Pepperoni;
    fun createClam() : Clams;
}