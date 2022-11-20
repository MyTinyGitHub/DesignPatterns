package decoratorPattern.beverages

interface Beverage {
    var cost : Double;
    var description : String;

    fun cost() : Double;
    fun description() : String;
}