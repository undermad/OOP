package State;

public class SunnyWeather implements WeatherBehave {
    @Override
    public void Sun() {
        System.out.println("Sun is visible all the time.");
    }

    @Override
    public void Clouds() {
        System.out.println("Clouds isn't here!");
    }
}
