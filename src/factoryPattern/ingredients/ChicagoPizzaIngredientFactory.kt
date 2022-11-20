package factoryPattern.ingredients

import factoryPattern.ingredients.cheese.Cheese
import factoryPattern.ingredients.cheese.MozzarellaCheese
import factoryPattern.ingredients.clams.Clams
import factoryPattern.ingredients.clams.FrozenClams
import factoryPattern.ingredients.dough.Dough
import factoryPattern.ingredients.dough.ThickCrustDough
import factoryPattern.ingredients.pepperoni.Pepperoni
import factoryPattern.ingredients.pepperoni.SlicedPepperoni
import factoryPattern.ingredients.sauce.PlumTomatoSauce
import factoryPattern.ingredients.sauce.Sauce
import factoryPattern.ingredients.veggies.BlackOlives
import factoryPattern.ingredients.veggies.EggPlant
import factoryPattern.ingredients.veggies.Spinach
import factoryPattern.ingredients.veggies.Veggies

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThickCrustDough();
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce();
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese();
    }

    override fun createVeggies(): Array<Veggies> {
        return arrayOf(Spinach(), BlackOlives(), EggPlant())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni();
    }

    override fun createClam(): Clams {
        return FrozenClams();
    }
}