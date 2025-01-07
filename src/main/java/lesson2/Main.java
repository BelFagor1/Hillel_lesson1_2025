package lesson2;

public class Main {
    private static final double coefficient = 1.609;
    public static void main(String[] args) {
        System.out.println(convertMileToKm(5));
    }
    private static double convertMileToKm(double mile) {
        return mile * coefficient;
    }
}
