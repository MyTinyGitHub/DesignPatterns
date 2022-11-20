package adapterAndFacadePattern.facadePattern.devices

class StreamingPlayer {
    private var isOn : Boolean = false;

    fun on() {
        if(!isOn) {
            isOn = true;
            println("Turning on the streaming player")
        }
    }

    fun off() {
        if(isOn) {
            isOn = false
            println("Turning off the streaming player")
        }
    }

    fun pause() {
        println("Pausing the streaming player")
    }

    fun play() {
        println("Play the streaming player")
    }

    fun stop() {
        println("Stopping the streaming player")
    }

    fun setTwoChannelAudio() {
        println("Setting two channel audio for streaming player")
    }


}