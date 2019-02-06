public class WeatherConditionals
{
    public static String getWeatherAdvice(int temperature, String description)
    {
        boolean windy = false;
        if(description.indexOf("windy") != -1)  windy = true;
        if(description.indexOf("snow") != -1 && temperature >= 100) return("That snow is hacking.");
        else if(windy == false && temperature > 30) return("It's safe to go outside, " + temperature + " degrees and " + description);
        else if(windy == true) return("Too windy or cold! Enjoy watching the weather through the window.");
        else return("Too windy or cold! Enjoy watching the weather through the window.");
    }
    public static String getHikingAdvice(int temperature, int windchill, int humidity, String description) {
        if(temperature < 45 || temperature > 75) return("Don't hike, temperature not adequate.");
        else if(windchill <= 0) return("Don't hike, windchill to cold.");
        else if(humidity <= 20 || humidity >= 60) return("Don't hike, bad humidity.");
        else if(description.indexOf("snow") != -1 || description.indexOf("rain") != -1 || description.indexOf("storm") != -1 || description.indexOf("tornado") != -1 || description.indexOf("huricanne") != -1) return("Don't hike, poor weather conditions.");
        else return("Have fun hiking!");
    }
}
