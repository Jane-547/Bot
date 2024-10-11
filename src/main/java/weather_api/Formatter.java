package weather_api;

import com.google.gson.Gson;
import weather_api.weather.GetWeather;

public class Formatter {
    public GetWeather parse(String json){
        Gson gson = new Gson();
        GetWeather getWeather = gson.fromJson(json, GetWeather.class);
        return getWeather;
    }
}
