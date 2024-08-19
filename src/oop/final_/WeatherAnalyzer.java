package oop.final_;

public class WeatherAnalyzer {
    static boolean checkTemperatureAlert(double temperature){
        if(temperature > WeatherConstants.MAX_TEMPERATURE_ALERT){
            System.out.println("온도가 경보치를 초과합니다.");
            return true;
        } else if (temperature < WeatherConstants.MIN_TEMPERATURE_ALERT) {
            System.out.println("온도가 경보치 미만입니다.");
            return true;
        }
        return false;
    }
     static boolean checkPrecipitationAlert(double precipitation){
        if(precipitation > WeatherConstants.PRECIPITATION_ALERT){
            System.out.println("강수량이 기준치를 초광합니다.");
            return true;
        }
        return false;
     }
}
