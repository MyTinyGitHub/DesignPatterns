package commandPattern

import commandPattern.commands.Command
import commandPattern.commands.NoCommand

class Controller {
    val commands = Array(8) {Array<Command>(2) { NoCommand() } } ;

    fun press(row : Int, column: Int) {
        commands[row][column].execute();
    }

    fun set(row : Int, commandOn : Command, commandOff : Command) {
        commands[row][0] = commandOn;
        commands[row][1] = commandOff;
    }
}