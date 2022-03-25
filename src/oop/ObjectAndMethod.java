package oop;

public class ObjectAndMethod {
    int id;
    String name;

    void insert(int i,String n){
        this.id = i;
        this.name = n;
    }

    public static void main(String[] args) {
        ObjectAndMethod objmth = new ObjectAndMethod();
        objmth.insert(34,"David");

        System.out.println(objmth.id);
        System.out.println(objmth.name);
    }
}

//methodကိုသုံးပြီးfieldတွေထဲကိုinitializeလုပ်လို့ရတယ်
//ဒါပေမယ့် method ကိုမသုံးဘဲနဲ့construstorကိုဘဲသုံးတာပိုသင့်တော်တယ်
//methodကိုခိုင်းဖို့အတွက်ဘဲသုံးသင့်တယ်


