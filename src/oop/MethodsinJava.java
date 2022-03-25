package oop;

//main method
public class MethodsinJava {
    public static void main(String[] args) {
        printHello();

        MethodsinJava mth = new MethodsinJava();
        mth.sumTwoNum();
        mth.sumThreeNum();
        mth.checkLeapYear(2024);

        //arguments
        parameter(50, 40);//invoke
        parameter(30,20);

        greet("Jay B");
        greet("Myint Myat Zaw");

    }

    //User define method
    // 1.Static Method
    public static void printHello(){
        System.out.println("Hello!");

        int a = 20;
        int b = 20;
        int result = a+b;
        System.out.println(result);
    }

    //2.Instance Method
    public void sumTwoNum(){
        int a = 10;
        int b = 20;
        int result = a+b;
        System.out.println(result);
    }

    public void sumThreeNum(){
        int a = 10;
        int b = 20;
        int c = 30;
        int result = a+b+c;
        System.out.println(result);
    }

    //3.Parameter Method
    //parameter
    public static void parameter(int numberOne,int numberTwo){
        int result = numberOne + numberTwo;
        System.out.println(result);
    }

    public static void greet(String name){
        System.out.println("Hello : " + name);
    }

    public void checkLeapYear(int year){
        if(year%4 == 0){
            System.out.println(year + " is leap year.");
        }
        else{
            System.out.println(year + " is not leap year.");
        }
    }

}
//There are two types of method
//1.predefined method and 2. user-defined method

//Syntax of method
//1.access modifier
//2.non-access modifier
//3.return type
//4.methodName(parameter,header,implementation,body)


//Create =>parameter =>variable
//returnType methodName(){}


