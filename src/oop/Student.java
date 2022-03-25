package oop;

public class Student {
    String name = "mmz"; // Global Variables
    static int age;
    static float rollNumber;
    //global variableမှာ variableတွေကို Initialize ဘဲလုပ်ထားလဲ erroမတတ်ဘူး
    //output ထွက်ရင် null 0 တို့လို default value တွေထွက်မယ်

    public static void main(String[] args) {

        String message; // Local Variables
        message = "hello";

        System.out.println(age);
        System.out.println(rollNumber);
        //can call these variables bcoz they are global variables

        System.out.println(message);

        Student student = new Student();
        student.showInfo();
    }
    public void showInfo(){
        int number = 4;
        System.out.println(number);
        //local variableမှာinitializeဘဲလုပ်လို့မရဘူးassignလုပ်ကိုလုပ်ပေးရမယ်
//        System.out.println(message);
//        cannot call this variable bcoz these are local variable

        String name = "JB";
        //globalနဲ့local variable name တူရင် local ကိုဘဲထုတ်ပေးမယ်

        System.out.println(name);
        System.out.println(this.name);
        //this.နဲ့ခေါ်ရင်တော့ globalကvariableကိုလှမ်းခေါ်မယ်
    }

}
