package weather_api;

import weather_api.weather.GetWeather;

public class WeatherService implements Service{

    private Connection connection;
    private Formatter formatter;

    private static final String EMPTY_ERROR = "Вы не ввели город";
    private static final String CITY_ERROR = "Неверное название города";

    public WeatherService() {
        connection = new Connection();
        formatter = new Formatter();
    }

    @Override
    public String get(String city) {
        if (city.isEmpty()){
            return EMPTY_ERROR;
        }
        try {
            String info = connection.getJson(city);
            GetWeather getWeather = formatter.parse(info);
            String answer = getWeather.toString();
            return answer;
        } catch (NullPointerException e){
            e.printStackTrace();
            return CITY_ERROR;
        } catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
