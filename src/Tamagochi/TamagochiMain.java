package Tamagochi;

import java.util.Scanner;

public class TamagochiMain {
  public static void main(String[] args) {

    boolean isFertig = true;
    Spielplatz spielplatz = new Spielplatz(5, 7);
    Tamagochi tamagochi = new Tamagochi(3, 4);
    tamagochi.futterstand = 5;

    spielplatz.spielfieldZeichnen(tamagochi.x, tamagochi.y);

    do {
      Scanner scanner = new Scanner(System.in);
      String eingabe = scanner.next();
      tamagochi.bewegen(eingabe);
   //   spielplatz.spielfieldZeichnen(x, y);

    } while (isFertig);
  }
}
