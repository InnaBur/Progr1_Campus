package Uebung_10March;

import java.util.Scanner;

public class Monate_switch {

  public static void MonateRechner() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Monat");
    String monat = scanner.next();

    switch (monat.toLowerCase()) {
      case "jaenner":
      case "maerz":
      case "mai":
      case "juli":
      case "august":
      case "october":
      case "dezember":
        System.out.println("Monat hat 31 Tagen");
        break;
      case "april":
      case "juni":
      case "september":
      case "november":
        System.out.println("Monat hat 30 Tagen");
        break;
      case "februar":
        System.out.println("Monat hat 28 Tagen");
        break;
      default:
        System.out.println("fehler");
    }
  }
}
