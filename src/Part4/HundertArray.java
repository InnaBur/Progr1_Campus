package Part4;

import java.util.Random;

public class HundertArray {

  public static void main(String[] args) {

    Random random = new Random();

    int[][] arr = new int[8][8];

    int sum = 0;
    int max = 0;
    int min = 100;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = random.nextInt(0, 101);
        sum += arr[i][j];

        if (arr[i][j] > max) {
            max = arr[i][j];
        }

        if (arr[i][j] < min) {
            min = arr[i][j];
        }
      }
    }

    System.out.println("Summe aller Elemente: " + sum);
    System.out.println(
        "Durchschnitt aller Elemente: " + (double) sum / (arr.length * arr[0].length));
    System.out.println("Maximun in Array: " + max);
    System.out.println("Minimun in Array: " + min);
  }
}
