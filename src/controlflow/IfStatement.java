package controlflow;

public class IfStatement {
    public static void main(String[] args) {
        //syntax => dataType variableName = value;

        //decision making statement
        //loop statement
        //jump statement

        //if
        //if else
        //switch

        //if(condition){} => if ture, do something

        //boolean => true or false

        int a = 10;
        int b =9;

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        }

        if(a>b){
            System.out.println((a>b) + " one statement");
        }else{
            System.out.println((a>b) + " second statement");
        } //if else

        int mark = 39;
        if(mark <= 40){
            System.out.println("fail");
        }else if(mark >=80){
            System.out.println("D");
        }else{
            System.out.println("pass");
        } // else if



    }
}
