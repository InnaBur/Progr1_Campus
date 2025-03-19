package Tamagochi;

import java.util.Random;
import java.util.Scanner;

public class TamagochiMain {
  public static void main(String[] args) {

    SpielController spielController = new SpielController();
    Spielplatz spielplatz = new Spielplatz();
    Random random = new Random();

    int x = random.nextInt(0, 6);
    int y = random.nextInt(0, 8);
    Tamagochi tamagochi = new Tamagochi(x, y);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Geben Sie bitte den Futterstand");
    tamagochi.futterstand = scanner.nextInt();

    spielplatz.spielfieldZeichnen(tamagochi.x, tamagochi.y);

    do {
      System.out.println("Geben Sie bitte die Richtung. Sie können r, l, u, o (rechts, links, unten, oben) eingeben \n");
      String eingabe = scanner.next();
      tamagochi.bewegen(eingabe);
      System.out.println("X = " + tamagochi.getX());
      System.out.println("Y = " + tamagochi.getY());
    } while (!spielController.istSpielFertig(tamagochi));
  }
}
