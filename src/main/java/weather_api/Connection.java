package weather_api;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Connection {
    private static final String apiKey = "9df5a2e02fbd9ca05303c7626dd299be";

    public String getJson(String city) throws Exception{
        StringBuilder stringBuilder = new StringBuilder();

        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=" + city + "&units=metric&appid=" + apiKey);
        URLConnection connection = url.openConnection();
        Scanner scanner = new Scanner(connection.getInputStream());
        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
        }

//        System.out.println("от сервера пришел ответ: " + stringBuilder);
        return stringBuilder.toString();
    }
}
