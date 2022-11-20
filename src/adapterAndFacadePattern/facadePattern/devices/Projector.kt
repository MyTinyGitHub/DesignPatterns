package adapterAndFacadePattern.facadePattern.devices

class Projector {
    private var isOn : Boolean = false

    fun on() {
        if(!isOn) {
            isOn = false;
            println("Turning on projector")
        }
    }

    fun off() {
        if(isOn) {
            isOn = false;
            println("Turning off projector")
        }
    }

    fun tvMode() {
        println("Turning projector to tv mode")
    }

    fun wideScreenMode() {
        println("Turning projector to wide screen mode")
    }
}