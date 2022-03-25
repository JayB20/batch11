package oop;

public class Constructor {
    int id;
    String name;

//0 argument constructor or default constructor
//    Constructor(){
//        System.out.println("Constructor is working");
//    }

//parameter constructor
    public Constructor(int i,String n){
        this.id = i;
        this.name = n;
    }


    public static void main(String[] args) {
        Constructor con1 = new Constructor(26,"mmz"); // Objectဆောက်
        System.out.println(con1.id +" "+ con1.name);

        Constructor con2 = new Constructor(27,"JB");
        System.out.println(con2.id +" "+ con2.name);

        Constructor con3 = new Constructor(28,"myint");
        System.out.println(con3.id + " " + con3.name);
    }
}
//constructor သုံးတာfieldတွေကိုvalueပေးချင်လို့
//constructor name က classnameနဲ့တူရမယ်
//constructor name ကိုစာလုံးအကြီးနဲ့စပေးရမယ်
//return typeတွေvoidတွေမပေးရဘူး
//0 argument constructorက objectတစ်ကြိမ်ဆောက်တိုင်းတစ်ခါအလုပ်လုပ်တယ်