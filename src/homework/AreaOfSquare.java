package homework;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {

        System.out.print("Enter an number for length!");
        int length = new Scanner(System.in).nextInt();

        System.out.print("Enter an number for size!");
        int size = new Scanner(System.in).nextInt();

        int area = length * size;
        System.out.println("Area of Square : " + area);
    }
}