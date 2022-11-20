package decoratorPattern.beverages.condiments

import decoratorPattern.beverages.Beverage

class SteamedMilk(beverage : Beverage) : Condiment(beverage,.10, "Steamed Milk")
class Mocha(beverage : Beverage) : Condiment(beverage,.20, "Mocha")
class Soy(beverage : Beverage) : Condiment(beverage,.15, "Soy")
class Whip(beverage : Beverage) : Condiment(beverage,.10, "Whip")