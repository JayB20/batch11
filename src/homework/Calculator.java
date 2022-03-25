package homework;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        int number1 = new Scanner(System.in).nextInt();

        System.out.println("Enter a operator \" + - * / \":");
        String operator = new Scanner(System.in).nextLine();

        System.out.print("Enter second number:");
        int number2 = new Scanner(System.in).nextInt();

        if(operator.equals("+")){
            System.out.println(number1+number2);
        }else if(operator.equals("-")){
            System.out.println(number1-number2);
        }else if(operator.equals("*")){
            System.out.println(number1*number2);
        }else if(operator.equals("/")){
            System.out.println(number1/number2);
        }else{
            System.out.println("Your operator is wrong");
        }

    }
}
