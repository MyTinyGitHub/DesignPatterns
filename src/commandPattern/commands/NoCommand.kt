package commandPattern.commands

class NoCommand : Command {
    override fun execute() {
        println("Nothing Command")
    }

    override fun undo() {
        println("Nothing Command")
    }
}