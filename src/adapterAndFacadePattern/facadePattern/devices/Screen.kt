package adapterAndFacadePattern.facadePattern.devices

class Screen {
    private var isUp : Boolean = false;

    fun up() {
        if(!isUp) {
            isUp = true;
            println("Putting screen up")
        }
    }

    fun down() {
        if(isUp) {
            isUp = false;
            println("Putting screen down")
        }
    }

    override fun toString() : String {
        return if(isUp) {
            "Screen is up"
        } else {
            "Screen is down"
        }
    }
}