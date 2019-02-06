public class StringTester
{
    public static String weatherCondition = "freezing rain";
    public static void main()
    {
        System.out.println(weatherCondition.length());
        System.out.println(weatherCondition.substring(0, weatherCondition.indexOf(" ")));
        String weatherCondition1 = new String("freezing rain");
        String weatherCondition2 = new String("freezing rain");
        boolean result1 = (weatherCondition1 == weatherCondition2);
        boolean result2 = (weatherCondition1.equals(weatherCondition2));
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(WeatherConditionals.getWeatherAdvice(34, "sunny"));
        System.out.println(WeatherConditionals.getWeatherAdvice(32, "windy"));
        System.out.println(WeatherConditionals.getWeatherAdvice(33, "snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(30, "snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(30, "windy"));
        System.out.println(WeatherConditionals.getWeatherAdvice(100, "snow"));
        System.out.println(WeatherConditionals.getHikingAdvice(29, 50, 50, "sunny"));
        System.out.println(WeatherConditionals.getHikingAdvice(50, -20, 30, "sunny"));
        System.out.println(WeatherConditionals.getHikingAdvice(70, 50, 20, "sunny"));
        System.out.println(WeatherConditionals.getHikingAdvice(70, 50, 50, "light rain"));
        System.out.println(WeatherConditionals.getHikingAdvice(70, 50, 50, "sunny"));
    }
}
