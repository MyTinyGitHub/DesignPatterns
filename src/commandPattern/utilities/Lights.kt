package commandPattern.utilities

class Lights(var place : String) {

    fun on() {
        println("$place lights on")
    }

    fun off() {
        println("$place lights off")
    }
}