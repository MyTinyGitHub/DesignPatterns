package observerPattern

import observerPattern.display.StatisticsDisplay

fun main() {
    val displayHandler = DisplayHandler();
    displayHandler.notifyObserver();

    displayHandler.addObserver(StatisticsDisplay());
    displayHandler.notifyObserver();

    displayHandler.updateHumidity(70.0)
    displayHandler.updatePressure(10.0)
    displayHandler.updateTemperature(12.5)

    displayHandler.notifyObserver();
}