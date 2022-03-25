package array;

public class ArrayCopy {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,9,8,7,3,4,5};
        System.out.println(numbers.getClass().getName());

        int other[] = new int [7];

        System.arraycopy(numbers,0,other,3,4);//arguments
        for (int i = 0; i< other.length; i++) {
            System.out.print( other[i]+"\t");
        }

        System.out.println();

        int another[] = other.clone();
        for (int i = 0; i <another.length; i++){
            System.out.print(another[i]+"\t");
        }
    }
}