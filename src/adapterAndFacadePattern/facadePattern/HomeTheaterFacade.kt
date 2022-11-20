package adapterAndFacadePattern.facadePattern

import adapterAndFacadePattern.facadePattern.devices.*

class HomeTheaterFacade {
    private val screen : Screen = Screen();
    private val popcorn : PopcornPopper = PopcornPopper();
    private val theaterLights : TheaterLights  = TheaterLights();
    private val tuner : Tuner = Tuner()
    private val amplifier : Amplifier = Amplifier();
    private val streamingPlayer : StreamingPlayer = StreamingPlayer();
    private val projector : Projector = Projector();

    fun watchMovie(){
        screen.down();
        popcorn.on();
        tuner.on();
        tuner.setAm()
        amplifier.on();
        projector.on();
        projector.wideScreenMode();
        theaterLights.on();
        streamingPlayer.on()
        streamingPlayer.setTwoChannelAudio()
        popcorn.pop();
    }

    fun endMovie() {
        streamingPlayer.off();
        theaterLights.off();
        projector.off();
        amplifier.off();
        tuner.off();
        popcorn.off()
        screen.up();
    }

    fun listenToRadio() {
        amplifier.on();
        tuner.on();
        tuner.setFm();
    }

    fun endRadio() {
        tuner.off();
        amplifier.off()
    }
}