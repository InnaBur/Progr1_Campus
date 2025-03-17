package Uebung_10March;

import java.util.Scanner;

public class Switch_ub {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcher Tag ist es?");

    String tag = scanner.next();
    int einkauf = 1000;
    double price = 0;

    switch (tag) {
      case ("Montag"):
      case ("Dienstag"):
        price = einkauf - einkauf * 0.1;
        System.out.println("Sie bekommen 10% Rabbat und Preis ist " + price);
        break;

      case ("Mittwoch"):
      case ("Donnerstag"):
        price = einkauf - einkauf * 0.15;
        System.out.println("Sie bekommen 15% Rabbat und Preis ist " + price);
        break;

      case ("Freitag"):
      case ("Sammstag"):
        price = einkauf - einkauf * 0.2;
        System.out.println("Sie bekommen 20% Rabbat und Preis ist " + price);
        break;

      default:
        System.out.println("Sie bekommen keine Rabbat");
    }
  }
}
