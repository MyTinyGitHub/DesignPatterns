package commandPattern

import commandPattern.commands.*
import commandPattern.utilities.Fan
import commandPattern.utilities.Lights

fun main() {
    val controller = Controller();

    val kitchenlLights = Lights("Kitchen");
    val livingRoomFan = Fan("Living Room");

    val partyOn = MacroCommand(arrayOf(LightsOnCommand(kitchenlLights), FanOnCommand(livingRoomFan)));
    val partyOff = MacroCommand(arrayOf(LightsOffCommand(kitchenlLights), FanOffCommand(livingRoomFan)));

    controller.press(0,0);

    controller.set(0, LightsOnCommand(kitchenlLights), LightsOffCommand(kitchenlLights));
    controller.press(0, 0)
    controller.press(0, 1)

    controller.set(1, FanOnCommand(livingRoomFan), FanOffCommand(livingRoomFan))
    controller.press(1, 0)
    controller.press(1, 0)
    controller.press(1, 0)
    controller.press(1, 1)

    controller.set(2, partyOn, partyOff)
    controller.press(2, 0)
    controller.press(2, 1)
}