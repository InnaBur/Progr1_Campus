package Uebung_03_18_19_OOP.Teilnehmer;

import java.util.Scanner;

public class TeilnehmerMain {
  public static void main(String[] args) {
    Teilnehmer bob = new Teilnehmer("Bob", 25);
    Teilnehmer alice = new Teilnehmer("Alice", 26);
    bob.setAdresse("Jakominiplatz, 10, Graz 8010");
    alice.setAdresse("Griesplatz, 15, Graz 8020");

    for (int i = 0; i < 10; i++) {
      bob.hatFrageGestellt();
      if (i < 4) {
        alice.hatFrageGestellt();
      }
    }

    alice.teilnehmerInfo();
    bob.teilnehmerInfo();
    alice.rueckgabeFragenCounter();

    Scanner scanner = new Scanner(System.in);

//    Teilnehmer t = new Teilnehmer();
//    t.setName(scanner.next());


  }
}
