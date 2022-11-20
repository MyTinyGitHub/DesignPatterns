package adapterAndFacadePattern.facadePattern.devices

class Amplifier() {
    private var isOn : Boolean = false;

    private var volume : Int = 0;
    private var tuner : Tuner? = null;
    private var player : StreamingPlayer? = null;

    fun on() {
        if(!isOn) {
            isOn = true;
            println("Turning on the amplifier");
        }
    }

    fun off() {
        if(isOn) {
            isOn = false;
            println("Turning off the amplifier")
        }
    }

    fun setStreamingPlayer(player: StreamingPlayer){
        this.player = player;
    }

    fun setStereoSound(sound : String) {
        println("Setting stereo sound to $sound")
    }

    fun setSurroundSound(sound : String) {
        println("Setting surround sound to $sound")
    }

    fun setTuner(tuner : Tuner) {
        this.tuner = tuner;
    }

    fun setVolume(volume : Int) {
        this.volume = volume;
    }

    override fun toString() : String {
        return if(isOn) {
            "Amplifier \n volume set to $volume \n Player is $player \n Tuner is $tuner";
        } else {
            "Amplifier is off";
        }
    }
}

