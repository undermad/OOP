package State;

public class Weather {
    private WeatherBehave weatherBehave;

    public Weather(WeatherBehave weatherBehave) {
        this.weatherBehave = weatherBehave;
    }

    public void performWeather(){
        weatherBehave.Sun();
        weatherBehave.Clouds();
    }

    public void setWeatherBehave(WeatherBehave weatherBehave) {
        this.weatherBehave = weatherBehave;
    }
}
