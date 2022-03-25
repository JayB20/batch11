package homework;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.print("Enter an number!!!");
        int num = new Scanner(System.in).nextInt();

        int result = 1;
        for (int fact = num; fact > 0; fact--){
            result *= fact;
        }
        System.out.println(num + "!" + " = "+ result);
    }
}
