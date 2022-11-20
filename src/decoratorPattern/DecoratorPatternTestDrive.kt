package decoratorPattern

import decoratorPattern.beverages.Beverage
import decoratorPattern.beverages.Espresso
import decoratorPattern.beverages.HouseBlend
import decoratorPattern.beverages.condiments.Mocha
import decoratorPattern.beverages.condiments.Whip

fun main() {
    var beverage1 : Beverage = Espresso();

    println(beverage1.cost());
    println(beverage1.description())

    var beverage2 : Beverage = HouseBlend();
    beverage2 = Mocha(beverage2);
    beverage2 = Whip(beverage2);

    println(beverage2.cost())
    println(beverage2.description())
}