package Tamagotschi;

import java.util.Scanner;

public class SpielController {
  Spielplatz spielplatz = new Spielplatz();

  Tamagotschi tamagochi = new Tamagotschi();
  Ausrufezeichen ausrufezeichen = new Ausrufezeichen();
  boolean istNotGewonnen = true;
  boolean istSpielNotFertig = true;
  int punkte = 0;

  public void run () {


    Scanner scanner = new Scanner(System.in);

    spielplatz.neuenSpielfieldZeichnen(
            tamagochi.x, tamagochi.y, ausrufezeichen.x_Point, ausrufezeichen.y_Point);

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
            statusUeberpruefung();
            spielplatz.neuenSpielfieldZeichnen(tamagochi.x, tamagochi.y, ausrufezeichen.x_Point, ausrufezeichen.y_Point);
            break;
          case 2: tamagochi.futtern();
            break;
          case 3:
            istSpielNotFertig = false;
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
    } while (istSpielNotFertig);
  }

  private void statusUeberpruefung() {
    if (tamagochi.x == ausrufezeichen.x_Point
            && tamagochi.y == ausrufezeichen.y_Point) {
      ausrufezeichen.ueberpruefenUndAktualisieren(tamagochi.x, tamagochi.y);
      System.out.println("Sie haben gewonnen!");
      punkte += 1;
      System.out.println("Sie haben " + punkte + " Punkten");
    }
  }
}



