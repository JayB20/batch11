package inheritance;

public class MethodOverLoading{
    public static void main(String[] args){
        addTwoNumber(12,12);
        addTwoNumber(14);
        addTwoNumber("mmz",26);

        //dataType must be different,parameter and method name can be same.
    }

    public static void addTwoNumber(int a,int b){
        System.out.println(a+b);
    }

    public static void addTwoNumber(int a){
        System.out.println(a+15);
    }

    public static void addTwoNumber(String name,int a){
        System.out.println(name+a);
    }
}

