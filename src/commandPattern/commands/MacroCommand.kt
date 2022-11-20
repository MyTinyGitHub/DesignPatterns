package commandPattern.commands

class MacroCommand(private var commands: Array<Command>) : Command {
    override fun execute() {
        commands.forEach(Command::execute)
    }

    override fun undo() {
        commands.forEach(Command::undo)
    }
}