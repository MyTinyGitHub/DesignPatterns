package commandPattern.commands

import commandPattern.utilities.Fan
import commandPattern.utilities.FanSpeed

class FanOffCommand(private var fan: Fan) : Command {
    var prevState : FanSpeed = FanSpeed.OFF;

    override fun execute() {
        prevState = fan.getSpeed();
        this.fan.off();
    }

    override fun undo() {
        fan.set(prevState)
    }
}