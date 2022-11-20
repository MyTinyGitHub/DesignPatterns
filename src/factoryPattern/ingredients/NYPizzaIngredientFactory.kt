package factoryPattern.ingredients

import factoryPattern.ingredients.cheese.Cheese
import factoryPattern.ingredients.cheese.ReggianoCheese
import factoryPattern.ingredients.clams.Clams
import factoryPattern.ingredients.clams.FreshClams
import factoryPattern.ingredients.dough.Dough
import factoryPattern.ingredients.dough.ThinCrustDough
import factoryPattern.ingredients.pepperoni.Pepperoni
import factoryPattern.ingredients.pepperoni.SlicedPepperoni
import factoryPattern.ingredients.sauce.MarinaraSauce
import factoryPattern.ingredients.sauce.Sauce
import factoryPattern.ingredients.veggies.BlackOlives
import factoryPattern.ingredients.veggies.EggPlant
import factoryPattern.ingredients.veggies.Spinach
import factoryPattern.ingredients.veggies.Veggies

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThinCrustDough();
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese();
    }

    override fun createVeggies(): Array<Veggies> {
        return arrayOf(Spinach(), BlackOlives(), EggPlant())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni();
    }

    override fun createClam(): Clams {
        return FreshClams();
    }
}