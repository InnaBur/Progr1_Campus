package Part3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysTask {

  public static void main(String[] args) {

    Array1();
    ArrMax();
    ArrStrLang();
    ArrSumm();
    ArrRandomZahl();
    ArrRandomGeradeZahl();
    ArrString();
   // ArrGrossConsole();
    ArrKleinElement();
    ArrDurch();
  }

  //Diese Methode erzeugt ein Array von 10 Ganzzahlen und gibt diese anschließend, Element für Element , in der Konsole aus
  public static void Array1() {
    int[] arr = new int[10];
    Random r = new Random();

    //Befuellen des Arrays mit Random-int-Zahlen
    for (int el: arr) {
      el = r.nextInt(0, 101);
      System.out.print(el + " ");
    }
    System.out.println();
  }

  //Diese Methode findet und gibt das größte Element in einem Array zurück
  public static void ArrMax() {
    double[] arr = {2.5, 3.0, 7.8, -45.6, 12.12};

    Arrays.sort(arr);
    System.out.println("SORT!!" + Arrays.toString(arr));
    double max = arr[0];
    for (double i : arr) {
      if (i > max) {
        max = i;
      }
    }

    System.out.println("Max = " + max);

  }

  //Diese Methode gibt die Länge jedes Strings im Array aus
  public static void ArrStrLang() {

    String [] arr = {"Hello", "World", "Montag", "Hey", "Dienstag", "Mittwoch","Sonntag", "Freitag"};
    int lang = 0;

      for (String s : arr) {
          for (int i = 0; i < s.length(); i++) {
              lang += 1;
          }
          System.out.println("Lang von Wort " + s + " ist " + lang);
          lang = 0;
      }
  }

  //Diese Methode berechnet eine Summe aller Elemente im Array
  public static void ArrSumm() {

    int[] arr = {2, 5, 3, 0, 7, 8, -45, 6, 12, 12, 10, 1};
    int sum = 0;

    for (int i : arr) {
      sum += i;
    }
    System.out.println("Sum ist " + sum);
  }

  // Diese Methode erzeugt Zufallszahlen und gibt die Zahlen im Array aus
  public static void ArrRandomZahl() {

    double [] randomArr = new double[15];
    Random r = new Random();

    for (int i = 0; i < randomArr.length; i++) {
      randomArr[i] = r.nextDouble(1, 101);
      System.out.println(i + " Element des Arrays ist " + randomArr[i]);
    }
  }

  // Diese Methode erzeugt Zufallszahlen und gibt nur die geraden Zahlen im Array aus
  public static void ArrRandomGeradeZahl() {

    int [] randomArr = new int[20];
    Random r = new Random();

    System.out.println("Ein gerades Element des Arrays ist: ");
    for (int i = 0; i < randomArr.length; i++) {
      randomArr[i] = r.nextInt();
      if (randomArr[i] % 2 == 0) {
        System.out.print(randomArr[i] + " ");
      }
    }
  }

  // Diese Methode gibt diejenigen Strings im Array aus, die mit einem bestimmten
  // Buchstaben beginnen
  public static void ArrString() {

    String [] arr = {"Hello", "World", "Montag", "Hey", "Dienstag", "Mittwoch","Sonntag", "Freitag", "Mint", "Feier"};
    char ch = 'm';
    int count = 0;

    System.out.println();
    for (String wort: arr) {
      if (wort.toLowerCase().charAt(0) == ch) {
        System.out.println("Das Wort, das mit " + ch + " beginnt: " + wort);
        count++;
      }
      }

    //neues Array, um Resultat als Array zeigen
    String [] arr2 = new String[count];
    int j = 0;
      for (String s : arr) {
          if (s.toLowerCase().charAt(0) == ch) {
              arr2[j] = s;
              j++;
          }
      }

    System.out.println("Array, in dem alle Woerte aus " + ch + " beginnen ist - " + Arrays.toString(arr2));
  }

  // Diese Methode liest Elemente aus Konsole und gibt das größte Element aus
  public static void ArrGrossConsole() {

    Scanner scanner = new Scanner(System.in);
    int [] arr = new int [10];

    for (int i = 0; i < arr.length; i++) {
      System.out.println("Geben Sie bitte Zahl ");
      arr[i] = scanner.nextInt();
      }

    int max = arr[0];
    for (int el: arr) {
      if (el > max) {
        max = el;
      }
    }
    System.out.println("Deine Zahlen sind : " + Arrays.toString(arr) + "\n Das größte Element ist " + max);
  }

  // Diese Methode gibt das kleinste Element aus
  public static void ArrKleinElement() {
    int[] arr = {2, 5, 3, 0, 7, 8, -45, 6, 12, 12, 10, 1};
    int min = arr[0];

    for (int i: arr) {
      if (i < min) {
        min = i;
      }
    }

    System.out.println("Das kleinste Element ist " + min);
  }

  // Diese Methode berechnet und gibt das durchschnittliche Element im Array aus
  public static void ArrDurch() {
    double[] arr = {2.5, 3.0, 7.8, -45.6, 12.12, -8, 6.4, 66.1, 345.1};

    double sum = 0;

    for (double d: arr) {
      sum += d;
    }

    double durch = sum / arr.length;

    System.out.println(" Das durchschnittliche Element im Array " + durch);
  }
}
