package observerPattern.display

import observerPattern.WeatherData

class StatisticsDisplay : Display {

    var data : WeatherData = WeatherData(0.0, 0.0, 0.0);

    override fun display() {
        println("Statistics " + this.data.temperature);
    }

    override fun update(data: WeatherData) {
        this.data = data;
        this.display();
    }

}