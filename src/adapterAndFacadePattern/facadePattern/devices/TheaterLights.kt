package adapterAndFacadePattern.facadePattern.devices

class TheaterLights {
    private var isOn : Boolean = false;

    fun on() {
        if(!isOn) {
            isOn = true
            println("Turning on theater lights")
        }
    }

    fun off() {
        if(isOn) {
            isOn = false
            println("Turning off theater lights")
        }
    }

    fun dim() {
        if(isOn) {
            println("Dimming the theater lights")
        }
    }

    override fun toString() : String {
        return if(isOn) {
            "Theater lights are on"
        } else {
            "Theater lights are off"
        }
    }
}