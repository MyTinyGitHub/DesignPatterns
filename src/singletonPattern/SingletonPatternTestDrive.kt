package singletonPattern

fun main () {

    println("Boiled: " + ChocolateBoiler.isBoiled())
    println("Empty: "  + ChocolateBoiler.isEmpty())

    println();
    println("Filling the boiler")
    ChocolateBoiler.fill()

    println("Boiled: " + ChocolateBoiler.isBoiled())
    println("Empty: "  + ChocolateBoiler.isEmpty())

    println();
    println("Boiling the chocolate")
    ChocolateBoiler.boil();

    println("Boiled: " + ChocolateBoiler.isBoiled())
    println("Empty: "  + ChocolateBoiler.isEmpty())

    println();
    println("Draining the boiler")
    ChocolateBoiler.drain()

    println("Boiled: " + ChocolateBoiler.isBoiled())
    println("Empty: "  + ChocolateBoiler.isEmpty())
}