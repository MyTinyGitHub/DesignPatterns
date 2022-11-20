package commandPattern.commands

import commandPattern.utilities.Lights

class LightsOnCommand(private var lights : Lights) : Command {
    override fun execute() {
        lights.on()
    }

    override fun undo() {
        lights.off()
    }
}