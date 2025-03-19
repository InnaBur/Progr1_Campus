package Uebung_03_18_19_OOP.Hund;

import java.util.Scanner;

public class HundMain {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Kann Hund Stöck bringen? 1 - wenn Ja, 0 - wenn nein");
    int antwort = scanner.nextInt();
    boolean kannHund= true;

    if (antwort == 1) {
      kannHund = true;
    } else if (antwort == 0) {
      kannHund = false;
    } else {
      System.out.println("Falsche Eingabe!");
    }

    Hund hund1 = new Hund("Dog", 2, "Labrador", "schwarz");

    hund1.bellen();
    hund1.stoeckchenBringen(kannHund);
  }
}
