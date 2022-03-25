package array;

public class CustomerArrayCopy {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,5,6,7,8,4};

        int copy[] = new int[numbers.length];//default is 0,0,0,0,0,0,0,0
        for (int i = 0; i < numbers.length; i++) {
            copy[i] = numbers[i];
            System.out.print(copy[i]+"\t");
        }

        System.out.println();

        //Decending Array
        int value=0;
        for (int i = 0; i < numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]>numbers[j]){
                    value=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=value;
                }
            }

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }

        System.out.println();
        System.out.println(numbers[numbers.length-3]);

    }
}
