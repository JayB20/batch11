package methodoverriding;

public class Bird extends Animal{
    @Override
    public void eat(){
        System.out.println("Bird is Eating...");
    }
}
