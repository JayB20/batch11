package controlflow;

public class NestedIfStatement {
    public static void main(String[] args) {
        int a = 39;
        if(a>40){

            int b = 10;
            if(b==1){
                System.out.println("a is equal to 1");
            }else if(b==2){
                System.out.println("B is equal to 2");
            }
            else {
                System.out.println("B is not equal to 1 and 2");
            }
        }else {
            System.out.println("a is less than 40");
        }
    }
}

//git add .
//git commit -m "ပေးချင်တဲ့နာမည်"
//git push origin master
