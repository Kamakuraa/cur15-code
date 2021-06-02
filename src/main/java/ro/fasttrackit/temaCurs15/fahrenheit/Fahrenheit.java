package ro.fasttrackit.temaCurs15.fahrenheit;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {

        fahrenheitToCelsius(50);
        celsius(10);

    }

    public static double fahrenheitToCelsius(double temp) {
        double celsius;
        celsius = (temp - 32) * 5 / 9;
        System.out.println("Celsius = " + celsius);
        return temp;
    }

    public static double celsius(double temp) {
        double fahrenheit;
        fahrenheit = (temp * 9 / 5) + 32;
        System.out.println("Fahrenheit = " + fahrenheit);
        return temp;
    }
}
