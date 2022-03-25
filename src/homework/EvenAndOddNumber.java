package homework;

public class EvenAndOddNumber {
    public static void main(String[] args) {
        int numbers[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

//                for (int i=0; i<numbers.length;i++){
//                    if(numbers[i]%2==0){
//                        System.out.println(numbers[i] + " is Even Number");
//                    }else{
//                        System.out.println(numbers[i] + " is Odd Number");
//                    }
//                } // Short Code

        for (int i=0; i<numbers.length;i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + "\t");
            }
        }
        System.out.println("are Even Numbers");

        for (int j=0; j<numbers.length;j++){
            if(numbers[j]%2!=0){
                System.out.print(numbers[j] + "\t");
            }
        }
        System.out.println("are Odd Numbers");


    }
}
