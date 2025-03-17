package Uebung_10March;

import java.util.Scanner;

public class Schleif_while {

  public static void main(String[] args) {

Stern();
  }

  public static void schleifWhile() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Zahl: ");
    int zahl = scanner.nextInt();
    int i = zahl;
    int summ = 0;

    while (i > 0) {
      summ += i;
      i--;
    }

    System.out.println("Summ von 1 bis " + zahl + " ist " + summ);
  }

  public static void schleifDoWhile() {
    Scanner scanner = new Scanner(System.in);
    String pass;

    do {
      System.out.println("Password: ");
      pass = scanner.next();
    } while (!pass.equals("geheim"));

    System.out.println("Das Passwort ist korrekt");
  }

  public static void forSh(){

    for (int i = 1; i <=10; i++) {
      System.out.print(i + " ");
    }

    System.out.println(" ");

    for (int i = 0; i <=30; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }
}
    public static void Stern(){

     for (int i = 5; i > 0; i--) {
        for (int j = 5; j >= i; j--) {
          System.out.print("*");
        }
        System.out.println(" ");
      }



      for (int i = 0; i < 5; i++) {
        for (int j = 0; j <= i; j++) {
          System.out.print("*");
        }
        System.out.println(" ");
      }

      }

}
