package homework;

import java.util.Scanner;

public class AreaOfCircle {
    final static double pi = 3.142;
    public static void main(String[] args) {

        System.out.print("Enter radius of circle!");
        double r = new Scanner(System.in).nextDouble();
        double area = pi*(r*r);

        System.out.println("Area of Circle : " + area);
    }
}
//A=Pi*(r*r)
