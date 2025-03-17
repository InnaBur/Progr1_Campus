package Part3;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArraysTask {

  public static void main(String[] args) {

   // ArrayInKonsole();
    ArreyAusKonsole();
  }

  public static void ArrayInKonsole() {

    int[][] arr = {{1, 3, 4}, {4, 6, 7}};
    int summ = 0;
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println("Werte " + arr[i][j]);
        summ += arr[i][j];
        count++;
      }
    }

    for (int[] k : arr) {
      System.out.println(Arrays.toString(k));
    }

    System.out.println("Summ ist " + summ);
    System.out.println(count);
  }

  public static void ArreyAusKonsole() {

    int[][] arr = new int[2][3];
    int summ = 0;
    int count = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Geben Sie bitte 6 Zaehlen ein");

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        arr[i][j] = scanner.nextInt();
        summ += arr[i][j];
        count++;
      }
    }

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("Werte " + arr[i][j]);
      }
    }
    for (int[] k : arr) {
      System.out.println(Arrays.toString(k));
    }

    for (int[] row: arr) {
      for (int column: row) {
        System.out.println("Element ist " + column);
      }
    }

    System.out.println("Summ ist " + summ);
    System.out.println(count);
  }
}
