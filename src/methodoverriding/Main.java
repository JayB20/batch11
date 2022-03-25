package methodoverriding;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
    }
}

//Method Overriding(class မတူရဘူး)
//class တစ်ခုတည်းမှာ method တူတူရေးလို့မရဘူး
//Parent class မှာရှိတဲ့method ကိုပြန်ပြင်ပြီး သုံးချင်ရင်
//static classတွေမှာmethod overrideလုပ်လို့မရဘူး

//Rules for method overriding
//1.same parameters as parent class.
//2.same parameters
//3.must be inheritance