package observerPattern

import observerPattern.display.Display

class DisplayHandler : Subject {
    private val displays : ArrayList<Display> = ArrayList();
    private var weatherData : WeatherData = WeatherData(0.0, 0.0, 0.0);

    public fun updateTemperature(temperature : Double) {
        this.weatherData.temperature = temperature;
    }

    public fun updatePressure(pressure : Double) {
        this.weatherData.pressure = pressure;
    }

    public fun updateHumidity(humidity: Double) {
        this.weatherData.humidity = humidity;
    }

    override fun addObserver(display: Display) {
        this.displays.add(display);
    }

    override fun removeObserver(display: Display) {
        this.displays.remove(display)
    }

    override fun notifyObserver() {
        this.displays.forEach { e -> e.update(this.weatherData) }
    }


}