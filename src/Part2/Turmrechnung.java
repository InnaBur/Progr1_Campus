package Part2;

import java.util.Scanner;

public class Turmrechnung {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Zahl ");
    int zahl = scanner.nextInt();

    int mult;
    int div;

    for (int i = 0; i < 8; i++) {
      mult = zahl * (i + 2);

      System.out.println(zahl + " * " + (i + 2) + " = " + mult);

      zahl = mult;
    }

    for (int i = 0; i < 8; i++) {
      div = zahl / (i + 2);

      System.out.println(zahl + " / " + (i + 2) + " = " + div);

      zahl = div;
    }
  }
}
