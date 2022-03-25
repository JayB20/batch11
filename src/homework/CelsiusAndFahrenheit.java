package homework;

import java.util.Scanner;
public class CelsiusAndFahrenheit {
    public static void main(String[] args) {
        System.out.print("Enter Celsius Value!!!");
        double C = new Scanner(System.in).nextDouble();

        double F = (C * 9/5) + 32;

        System.out.println("Celsius to Fahrenheit Value is " + F);

        System.out.print("Enter Fahrenheit Value!!!");
        double Fa = new Scanner(System.in).nextDouble();

        double Ce = (Fa - 32) * 5/9;

        System.out.println("Fahrenheit to Celsius Value is " + Ce);
    }
}
