package decoratorPattern.beverages

open class BeverageImpl(override var cost: Double, override var description: String) : Beverage {
    override fun cost(): Double {
        return this.cost;
    }

    override fun description(): String {
        return this.description;
    }
}