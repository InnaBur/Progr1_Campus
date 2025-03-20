package Tamagotschi;

import java.util.Random;
import java.util.Scanner;

public class Tamagotschi {

  private static final int spielBreit = 7;
  private static final int spielHoch = 5;
  Random random = new Random();

  int x;
  int y;
  int futterstand;

  public Tamagotschi() {
    x = random.nextInt(0, 5);
    y = random.nextInt(0, 7);
    this.futterstand = random.nextInt(1, 11);
  }

  public void bewegen(String richtung) {

    boolean hatSichBewegt = false;

    if ((richtung.equals("r")) && y != spielBreit - 1) {
      y += 1;
      hatSichBewegt = true;
    } else if (richtung.equals("l") && y != 0) {
      y -= 1;
      hatSichBewegt = true;
    } else if (richtung.equals("u") && x != spielHoch - 1) {
      x += 1;
      hatSichBewegt = true;
    } else if (richtung.equals("o") && x != 0) {
      x -= 1;
      hatSichBewegt = true;
    } else {
      System.out.println("Falsche eingabe oder sie sind in der Grenze");
    }
    if (futterstand > 0 && hatSichBewegt) {
        futterstand--;
    }
  }

  public void futtern() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Geben Sie bitte den Futterstand");
    int input  = scanner.nextInt();
    futterstand = futterstand + input;
    if (futterstand > 10) {
      futterstand = 10;
    }
  }
}
