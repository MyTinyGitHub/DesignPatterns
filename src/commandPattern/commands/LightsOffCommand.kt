package commandPattern.commands

import commandPattern.utilities.Lights

class LightsOffCommand(private var lights: Lights) : Command {
    override fun execute() {
        lights.off()
    }

    override fun undo() {
        lights.on();
    }


}