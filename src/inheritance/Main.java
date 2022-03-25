package inheritance;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "M";
        person.age = 18;
        person.information();

        Student student = new Student();
        student.name = "Wayne";
        student.age = 19;

        student.rollNumber = 8;
        student.grade = 12;
        student.information();

        ObjectOne one = new ObjectOne();
        one.name = "WWW";
        one.age = 18;
        one.rollNumber = 15;
        one.message = "Hello";

        System.out.println(one.message);
    }
}

//Terms
//Class
//1. Sub Class (or) child class
//2. Super Class (or) parent class

//    Types of Inheritance in Java
//
//        1.Single Inheritance
//        There are two Classes.Class A and Class B
//        ***Class B extends Class A
//
//        2.Multilevel Inheritance
//        There are three Classes.ClassA,ClassB and ClassC
//        ***ClassC extends ClassB
//        ***ClassB extends ClassA
//
//        3.Hierarchial Inheritance
//        There are three Classes.ClassA,ClassB and ClassC
//        ***ClassA,ClassB extents ClassC

//        4.Hybrid Inheritance
//
//        5.Multiple Class(Not Support in Java)


