package oop;

//OOP == Object Oriented Programming Language

//    1. Class == template (Collection of objects)
//    2. Object (Object ကclass ရဲ့ instanceဖြစ်တယ်)
//    3. Inheritance == extands လုပ်ပေးရန်လိုတယ်
//    4. Polymorphism == overwrite လုပ်ပေးရန်လိုတယ်
//    5. Abstraction == implements လုပ်ပေးရန်လိုတယ်
// Abstraction ဖြစ်ချင်ရင် abstract class or interface ဆောက်ပေးရန်လိုတယ်
//    6. Encapsulation == getter, setter

//Object ==> State and Behaviour
//State ==> Variables
//behaviour ==> Method

//Class
// 1. Fields == Variables (method အပြင်မှာရေးရင် Fields)
// 2. Methods
// 3. Constructors
// 4. Blocks
// 5. Inner Class
// 6. Objects

public class OOP {
    static String name = "MMZ";
    public static void main(String[] args) {

        int numOne = 19; //Statement
        int numTwo = 29;

        int result = numOne + numTwo;
        System.out.println(result);

        int numberThree = 21;
        int numberFour = 12;

        int resultTwo = numberThree + numberFour; //statement two
        System.out.println(resultTwo);

    }

}
//Method Declaring
/*

public static void methodName(){
//static method
}

public void methodName(int num1,String str){
//instance method
//parameter list
//method header and method body
    int a =12;
    int b =13;

}

public int methodName(){
//return type
}


1) public == access modifier
2) static == static method
3) void == return type
4) method Name
5) parameter list

//access modifier
1.public
2.private
3.protected
4.default

//Method name == verb and start with lower case
//public void sumTwoNumber(){
}

//public void areaOfTriangle(){
}

//Types of methods
//MainMethod
//UserDefinedMethod
//PreDefinedMethod


 */
