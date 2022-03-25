package oop;

class Teacher{
    int id = 007;
    String name = "Daw Su";
}

public class Objectinit {
    public static void main(String[] args) {
                            //Annoynemous Object
        System.out.println(new Teacher().id);
        System.out.println(new Teacher().name);

        int a=6,b=4,c=9;

        Teacher student=new Teacher(),student1 = new Teacher();
//        object တွေကိုတပြိုက်နက်ဆောက်လို့လဲရတယ်
    }
}
//Object have state and behaviour.

//attributes => direct
//method ==>
//constructor ==>

//new keyword
//newInstance() method
//clone()
//deserialization
//factory method

//ClassName obj=new Con();
