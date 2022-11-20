package adapterAndFacadePattern.facadePattern.devices

class PopcornPopper {
    private var isOn = false;
    fun on() {
        if(!isOn) {
            isOn = true;
            println("Turning on a popcorn popper")
        }
    }

    fun off() {
        if(isOn) {
            isOn = false;
            println("Turning off a popcorn popper")
        }
    }

    fun pop() {
        if(isOn) {
            println("Serving popcorn")
        }
    }

    override fun toString() : String {
        return if(isOn) {
            "Popcorn popper is on."
        } else {
            "Popcorn popper is off."
        }
    }
}