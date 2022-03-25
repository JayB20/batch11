package accessmodifier;

class Call{
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
//        System.out.println(obj.d);


    }
}

public class AccessModifier {
    public int a = 34;
    int b = 35; //default
    protected int c = 36;
    private int d = 37;
    final int e = 38;
    public static void main(String[] args) {

    }
}

//Two types of Modifier

//Access (in field and method can use)
//1.public ==> Everywhere can access
//2.private ==>can't even access in the same class that have different scope
// only can access in the same scope
//3.protected ==> can access if the package are same
//4.default ==> like protected

//Non-Access (in field and method can use)
//1.final
//2.abstract
//3.static
//4.transient
//5.synchronized
//6.volatile

//final can't  overwrite value assign and can't change if assign once like pi value

//Constructor cannot use non-access modifier.
