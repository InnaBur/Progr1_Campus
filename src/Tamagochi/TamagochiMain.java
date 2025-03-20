package Tamagochi;

import java.util.Random;
import java.util.Scanner;

public class TamagochiMain {
  public static void main(String[] args) {

    SpielController spielController = new SpielController();
    Spielplatz spielplatz = new Spielplatz();
    Random random = new Random();

    int x = random.nextInt(0, 5);
    int y = random.nextInt(0, 7);
    Tamagochi tamagochi = new Tamagochi(x, y);
    Scanner scanner = new Scanner(System.in);

    spielplatz.spielfieldZeichnen(tamagochi.x, tamagochi.y);

    do {
      System.out.println("Deine Futterstand ist " + tamagochi.futterstand +"\n Waehlen Sie bitte aus: 1. Bewegen 2. Fuettern 3. Spiel Beenden");

      try {
        int  auswahl = scanner.nextInt();

      switch (auswahl) {
        case 1:
          System.out.println(
              "Geben Sie bitte die Richtung. Sie können r, l, u, o (rechts, links, unten, oben) eingeben \n");
          String eingabe = scanner.next();
          tamagochi.bewegen(eingabe);
          break;
        case 2: tamagochi.futtern();
        break;
        case 3:
          spielController.istSpielNotFertig = false;
          System.out.println( "Spiel ist beendet");
          break;
        default:
          System.out.println("Wrong Eingabe");
          break;
      }
      }
      catch (Exception e){
        System.out.println("Ungültige Eingabe! Bitte geben Sie eine Zahl ein.");
        scanner.next();
        continue;
      }
    } while (spielController.istSpielNotFertig);
  }
}
