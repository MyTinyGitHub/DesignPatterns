package observerPattern.display

import observerPattern.WeatherData

interface Display {
    fun display();
    fun update(data: WeatherData);
}