package Uebung_13_3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask {

  public static void main(String[] args) {

    Array4();
  }

  public static void Array1() {
    String[] numbers = new String[100];

    int j = 0;
    for (int i = 2; i <= 200; i++) {
      if (i % 2 == 0) {
        numbers[j] = Integer.toString(i);
        j++;
      }
    }
    System.out.println(Arrays.toString(numbers));
  }

  public static void Array2_sort() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Bitte geben Sie die Zahl der anwesenden Personen: ");
    int personen = scanner.nextInt();

    String[] array = new String[personen];
    String temp = "";

    for (int i = 0; i < personen; i++) {
      System.out.println("Bitte geben Sie das nächste Name der Teilnehmerin: ");
      array [i] = scanner.next();
    }

  for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i].charAt(0) > array[j].charAt(0)) {
      //  if (array[i].compareTo(array[i+1]) > 0)
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(array));
  }

   /*
  for (int i = 0; i < array.length - 1; i++) {
    for (int j = 0; j < array.length - 1; j++) {
      if (array[i].charAt(0) > array[j + 1].charAt(0)) {
        temp = array[i];
      array[i] = array[j + 1];
      array[j = 1] = temp;
    }
  }
}
    System.out.println(Arrays.toString(array));
            }

    */


  public static void Array3_sort() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Bitte geben Sie die Zahl der anwesenden Personen: ");
    int personen = scanner.nextInt();

    String[] array = new String[personen];
    String temp = "";

    for (int i = 0; i < personen; i++) {
      System.out.println("Bitte geben Sie das nächste Name der Teilnehmerin: ");
      array [i] = scanner.next();
    }

    Arrays.stream(array).sorted().forEach(System.out::println);
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
  }

  public static void Array4() {

    int [] arr = new int[]{22, 32, 4, 10, 6};
    int count = 0;

    for (int i: arr) {
      count+= i;
    }

    int min = arr[0];
    int max =  arr[0];
    double durch = 0;

    for (int i: arr) {
      durch += i;
    }
    durch = (double) count / arr.length;

    for (int i: arr) {
      if (i > max) {
        max = i;
      }
      if (i < min) {
        min = i;
      }
    }

    System.out.println("summ ist " + count);
    System.out.println(max);
    System.out.println(min);
    System.out.println(durch);
  }
}
