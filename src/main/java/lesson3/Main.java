package lesson3;

public class Main {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(4));
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return  celsius * 1.8 + 32;
    }
}
