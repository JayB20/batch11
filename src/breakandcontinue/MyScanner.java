package breakandcontinue;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");
        int num = scanner.nextInt();

        scanner.nextLine();//ဒါပါမှint inputပြီးရင် string inputဆက်တောင်းမှာ

        System.out.println("Enter your name");
        String name = scanner.nextLine();
//        String name = scanner.next(); //spaceပါတာနဲ့Stringကိုဆက်မယူတော့ဘူး

        System.out.println("Your input :" +num);
        System.out.println("Hello!" + name);

        scanner.nextLine();

        System.out.println("Enter base : ");
        int base = scanner.nextInt();

        System.out.println("Enter high : ");
        int high = scanner.nextInt();

        int result = (base*high)/2;

        System.out.println("Area of Triangle is : " + result);
    }
}
