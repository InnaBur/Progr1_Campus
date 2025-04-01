package Part4;

public class SumMultiArray {

    public static void main(String[] args){


   // int  [][] arr = new int[4][];

    double [][] arr = {{8.8, 12}, {134,67.92,45,32.4,76}, {1}, {0, 0.56}};

    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            sum += arr[i][j];
        }
    }

    System.out.println("Summ is " + sum);
    }
}
