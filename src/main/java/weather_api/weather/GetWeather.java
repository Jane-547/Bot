package weather_api.weather;

import java.util.List;

public class GetWeather {
    private String name;
    private Main main;
    private List<Weather> weather;
    private Wind wind;

    public String getName() {
        return name;
    }


    public Main getMain() {
        return main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public Wind getWind() {
        return wind;
    }

    public void setMain(Main main) {
        this.main = main;
    }


    public void setWind(Wind wind) {
        this.wind = wind;
    }

    @Override
    public String toString() {
        return  "Город='" + name + '\'' + '\n' +
                "температура=" + main.getTemp() + '\n' +
                "ощущаемая температура'" + main.getFeels_like() + '\'' + '\n' +
                "описание погоды=" + getWeather().get(0).getDescription() + '\n' +
                "влажность=" + main.getHumidity() + '\n' +
                "скорость ветра='" + wind.getSpeed() + '\'';
    }
}
