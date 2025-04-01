package Part4;

import java.util.Random;

public class Dreidimensionales {
  public static void main(String[] args) {
    double[][][] arr = new double[4][3][2];
    Random random = new Random();
    double sum = 0;
    double min = 1;
    double max = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        for (int k = 0; k < arr[i][j].length; k++) {
            arr[i][j][k] = random.nextDouble(0, 1.0);
            sum += arr[i][j][k];

            if (arr[i][j][k] > max) {
                max = arr[i][j][k];
            }

            if (arr[i][j][k] < min) {
                min = arr[i][j][k];
            }
        }
      }
    }

      System.out.println("Summe aller Elemente: " + sum);
      System.out.println("Durchschnitt aller Elemente: " + (double) sum / (arr.length * arr[0].length * arr[0][0].length));
      System.out.println("Maximun in Array: " + max);
      System.out.println("Minimun in Array: " + min);
  }
}
