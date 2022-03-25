package controlflow;

public class WhileLoopStatement {
    public static void main(String[] args) {
        //while

        int a = 5;
        while (a<10){
            System.out.println(a);
            a++;
        }

        //dowhile
        do{
            System.out.print(a + "\t");
            a+=2;
        }while (a<20);

        System.out.println();

        int number = 4;
        do {
            System.out.println(number);
            number++;
        }while (number<7);
    }
}

