package singletonPattern

object ChocolateBoiler {
    private var empty = true;
    private var boiled = false;

    init {}

    fun fill() {
        if(empty) {
            this.empty = false;
            this.boiled = false;
        }
    }

    fun drain() {
        if(!empty && boiled) {
            empty = true;
        }
    }

    fun boil() {
        if(!empty && !boiled) {
            boiled = true;
        }
    }

    fun isBoiled() : Boolean {
        return this.boiled;
    }

    fun isEmpty() : Boolean {
        return this.empty;
    }
}