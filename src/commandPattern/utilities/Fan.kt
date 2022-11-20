package commandPattern.utilities

class Fan(var place : String) {
    var fanSpeed : FanSpeed = FanSpeed.OFF;

    private fun fast() {
        println("$place fan set to fast");
        fanSpeed = FanSpeed.FAST
    }

    private fun medium() {
        println("$place fan set to medium");
        fanSpeed = FanSpeed.MEDIUM
    }

    private fun slow() {
        println("$place fan set to slow");
        fanSpeed = FanSpeed.SLOW
    }

    fun getSpeed() : FanSpeed {
        return fanSpeed;
    }

    fun on() {
        when(fanSpeed) {
            FanSpeed.OFF -> fast();
            FanSpeed.FAST -> medium();
            FanSpeed.MEDIUM -> slow();
            FanSpeed.SLOW -> fast();
        }
    }

    fun off() {
        println("$place fan turned off");
        fanSpeed = FanSpeed.OFF;
    }
    fun set(fanSpeed : FanSpeed) {
        this.fanSpeed = fanSpeed;
    }
}

enum class FanSpeed {
    FAST,
    MEDIUM,
    SLOW,
    OFF
}

