package commandPattern.commands

import commandPattern.utilities.Fan
import commandPattern.utilities.FanSpeed

class FanOnCommand(private var fan : Fan) : Command {
    var prevSpeed : FanSpeed = FanSpeed.OFF;

    override fun execute() {
        prevSpeed = fan.getSpeed();
        fan.on();
    }

    override fun undo() {
        fan.set(prevSpeed)
    }
}