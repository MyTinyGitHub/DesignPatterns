package commandPattern.commands

interface Command {
    fun execute();
    fun undo();
}