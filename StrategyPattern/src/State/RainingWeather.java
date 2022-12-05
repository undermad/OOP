package State;

public class RainingWeather implements WeatherBehave {
    @Override
    public void Sun() {
        System.out.println("Sun is behind clouds.");
    }

    @Override
    public void Clouds() {
        System.out.println("Clouds are everywhere!");
    }

}
