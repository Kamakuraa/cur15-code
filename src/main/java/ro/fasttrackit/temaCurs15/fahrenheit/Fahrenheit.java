package ro.fasttrackit.temaCurs15.fahrenheit;


public class Fahrenheit {

    public static double fahrenheitToCelsius(double temp) {
        return (temp - 32) * 5 / 9;

    }

    public static double celsius(double temp) {
        return temp * 9 / 5 + 32;
    }
}
