import State.RainingWeather;
import State.SunnyWeather;
import State.Weather;
import State.WeatherBehave;

public class Main {
    public static void main(String[] args) {
        NPC_Behavior npcBehave = new NPC_Behavior();
        ENEMY_Behavior enemyBehave = new ENEMY_Behavior();

        Entity murloc = new ENEMY_Murloc(enemyBehave);
        Entity npc = new NPC_Merchant(npcBehave);

        murloc.performBehavior();
        npc.performBehavior();
        npc.setEntityBehavior(enemyBehave);
        npc.performBehavior();
        npc.setEntityBehavior(npcBehave);
        System.out.println("************************");
        npc.performBehavior();
        murloc.performBehavior();


        WeatherBehave sunny = new SunnyWeather();
        WeatherBehave raining = new RainingWeather();
        Weather weather = new Weather(sunny);
        weather.performWeather();
        weather.setWeatherBehave(raining);
        weather.performWeather();

    }
}