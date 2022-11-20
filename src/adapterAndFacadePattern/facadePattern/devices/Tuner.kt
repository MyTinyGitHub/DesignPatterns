package adapterAndFacadePattern.facadePattern.devices

class Tuner {
    private var isOn : Boolean = false;

    fun on() {
        if(!isOn) {
            this.isOn = true;
            println("Turning on the Tuner")
        }
    }
    fun off() {
        if(isOn) {
            isOn = false;
            println("Turning off the Tuner")
        }
    }
    fun setAm() {
        println("Setting the tuner to AM")
    }
    fun setFm() {
        println("Setting the tuner to FM")
    }

    fun setFrequency(frequency : Double) {
        println("Setting the tuner to $frequency frequency")
    }

    override fun toString(): String {
        return ""
    }
}