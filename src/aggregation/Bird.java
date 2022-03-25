package aggregation;

public class Bird {
    String color = "white";

    void eat(){
        System.out.println("Bird is eating...");
    }
}

class Parrot extends Bird{
    String color = "red";
    void eat(){
        System.out.println("Parrot is eating...");
    }

    public void showColors(){
        System.out.println(color);
        System.out.println(super.color);
        super.eat();
        eat();
    }
}
