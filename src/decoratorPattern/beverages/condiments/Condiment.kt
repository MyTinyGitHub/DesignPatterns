package decoratorPattern.beverages.condiments

import decoratorPattern.beverages.Beverage

open class Condiment(var beverage: Beverage, override var cost: Double, override var description: String) : Beverage {

    override fun cost(): Double {
        return beverage.cost() + this.cost;
    }

    override fun description(): String {
        return beverage.description() + " " + this.description;
    }
}