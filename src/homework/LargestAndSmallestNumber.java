package homework;

public class LargestAndSmallestNumber {
    public static void main(String[] args) {
        int number1[] = {1,789,34,2567,53,1,45678,54};
        int i=0;
        for (int j=0;j<number1.length;j++){
            if (number1[i] < number1[j]){
                number1[i] = number1[j];
            }else{
                number1[i] = number1[i];
            }
        }
        System.out.println("Largest Number in this array : " + number1[i]);

        int number2[] = {2,45,369,1,789,0,54,111};
        int a=0;
        for(int b=0;b<number2.length;b++){
            if (number2[a] > number2[b]){
                number2[a] = number2[b];
            }else{
                number2[a] = number2[a];
            }
        }
        System.out.println("Smallest Number in this array : " + number2[a]);
    }
}
