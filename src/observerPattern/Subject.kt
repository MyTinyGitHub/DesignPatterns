package observerPattern

import observerPattern.display.Display

interface Subject {
    fun addObserver(observer: Display);
    fun removeObserver(observer: Display);
    fun notifyObserver();
}