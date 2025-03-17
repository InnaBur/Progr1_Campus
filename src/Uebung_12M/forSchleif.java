package Uebung_12M;

import java.util.Scanner;

public class forSchleif {

  public static void main(String[] args) {
    Lift2();
  }

  public static void Quadrat() {
    for (int i = 0; i <= 2; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(" *");
      }
      System.out.println(" ");
    }
  }

  public static void Lift() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Wo sind Sie? Wenn Sie im Haus sind, drücken ie bitte 1, wenn nicht - 2");
    int antwort = scanner.nextInt();

    switch (antwort) {
      case 1:
        for (int i = 0; i <= 3; i++) {
          System.out.println("Sie sind in der Etage " + i);
        }
      case 2:
        for (int i = 0; i <= 67; i++) {
          if (i == 10 || i == 19 || i == 28 || i == 36) {
            System.out.println("Sie haben keine Zugang an der Etage " + i);
            continue;
          } else {
            System.out.println("Sie sind in der Etage " + i);
          }
        }
    }
  }

  public static void Lift2() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Wo sind Sie? Wenn Sie im Haus sind, drücken ie bitte 1, wenn nicht - 2");
    int antwort = scanner.nextInt();

    for (int i = 1; i <= 68; i++) {
      if (antwort == 2) {
        if (i == 10 || i == 19 || i == 28 || i == 36) {
          System.out.println("Sie haben keine Zugang an der Etage " + i);
          continue;
        } else {
          System.out.println("Sie sind in der Etage " + i);
        }
      } else {
        System.out.println("Sie sind in der Etage " + i);
        if (i == 4) {
          break;
        }
      }
    }
  }
}
