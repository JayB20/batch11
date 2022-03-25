package homework;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter an number!");
        int num = new Scanner (System.in).nextInt();

        String s = Integer.toString(num);

        if (s.length() == 4){
            if ( (num%4) == 0){
                System.out.println(num + " is a leap year!!!");
            }else{
                System.out.println("Sorry " + num + " is not a leap year!!!");
            }
        }else{
            System.out.println("Your Number is invalid.Pls type at least 4 digits!!!");
        }

    }
}
