package homework;

import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        System.out.print("Enter your birth month that must be 1 to 12!");
        int month = new Scanner(System.in).nextInt();

        System.out.print("Enter your birth day!");
        int day = new Scanner(System.in).nextInt();

       if(((month == 3 && day > 21) || (month == 4 && day <19))){
           System.out.println("You're Aries!");
       }else if((month == 4 && day > 20) || (month == 5 && day <20)) {
           System.out.println("You're Taurus!");
        }else if((month == 5 && day >21) || (month == 6 && day <20)){
           System.out.println("You're Gemini!");
       }else if((month == 12 && day > 22) || (month == 1 && day <19)){
           System.out.println("You're Capricorn!");
       }else if((month == 6 && day >21) || (month == 7 && day < 22)){
           System.out.println("You're Cancer!");
        }else if ((month == 7 && day >23) || (month == 8 && day <22)){
           System.out.println("You're Leo!");
       }else if ((month == 8 && day >23) || (month == 9 && day <22)){
           System.out.println("You're Virgo!");
       }else if ((month == 9 && day >23) || (month == 10 && day <22)){
           System.out.println("You're Libra!");
       }else if ((month == 10 && day >23) || (month == 11 && day <21)){
           System.out.println("You're Scorpio!");
       }else if ((month == 11 && day >22) || (month == 12 && day <21)){
           System.out.println("You're Sagittarius!");
       }else if ((month == 1 && day >20) || (month == 2 && day <18)){
           System.out.println("You're Aquarius!");
       }else{
           System.out.println("You're Pisces!");
       }
    }
}
