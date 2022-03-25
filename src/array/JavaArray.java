package array;

public class JavaArray {
    public static void main(String[] args) {
        int arrName[] = new int [6];
        arrName[0]=2;
        arrName[1]=3;
        arrName[2]=4;
        arrName[3]=5;
        arrName[4]=6;
        arrName[5]=7;

        String fruits[] = {"mango","apple","pineapple","orange"};
        System.out.println(fruits[2]);

        double nums[] = new double[] {23,34,5435,3456,3,45,32,45678};
        System.out.println(nums[3]);
        System.out.println(nums.length);// number of array room

        //array => object
        for (int j=0; j< arrName.length; j++){
            System.out.println(arrName[j]);
        }

        for(int i=0; i< nums.length; i++){
            System.out.println(nums[i]);
        }

        for(int i = arrName.length-1; i>=0 ; i--){
            System.out.println(arrName[i]);
        } //reverse

        for(int a: arrName){
            System.out.println(a);
        }

        //one dimensional array
        //two or multidimensional

        //jagged array
        //int car3[][] = new int[2][];
        //car3[0] = new int[3];
        //car3[1] = new int[2];

        //int car3[][]= {{23,34,3},{243545,43546}};

        int arrN[][] = {{2,45,576},{3453,45,72},{54,3224,94},{56,345,64}};
        System.out.println(arrN.length); //4

        arrN[3][1] = 45;

        for(int i=0 ; i<arrN.length; i++){
            for(int j =0 ; j<arrN[i].length;j++){
                System.out.print(arrN[i][j]+"\t");
            }
            System.out.println();
        }

    }
}

