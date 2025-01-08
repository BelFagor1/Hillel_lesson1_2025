package lesson3;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(4));
        System.out.println(convertFahrenheitToCelsius(4));
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return  celsius * 1.8 + 32;
    }
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return  (fahrenheit - 32) * ((double) 5 /9);
    }
}
