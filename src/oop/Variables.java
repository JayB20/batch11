package oop;

public class Variables {

    //Variables
    //Global Variable, Local Variable

    //Global Variables
    //1.Static Variables (Class နဲ့ဆိုင်သော)
    //2.Instance Variables (Object နဲ့ဆိုင်သော)

    static String name = "Wayne";//static variable
    String message = "Hello World!";//instance variable

    public static void main(String[] args) {
        //System.out.println(Variables.name);
        //same classဆိုclass nameပြန်ထည့်ပြီးမခေါ်လဲရတယ်
        System.out.println(name);
        System.out.println(OOP.name);

        Variables obj = new Variables();
        System.out.println(obj.message);

        Student student = new Student();
        System.out.println(student.name);
    }
}

