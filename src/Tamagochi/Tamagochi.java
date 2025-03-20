package Tamagochi;

import java.util.Random;
import java.util.Scanner;

public class Tamagochi {

  private static final int spielBreit = 7;
  private static final int spielHoch = 5;
  Spielplatz spielplatz = new Spielplatz();
  SpielController spielController = new SpielController();
  Random random = new Random();
  Ausrufezeichen ausrufezeichen = new Ausrufezeichen();
  int x;
  int y;
  int futterstand;

  //  public Tamagochi(int x, int y) {
  //    this.x = x;
  //    this.y = y;
  //    this.futterstand = random.nextInt(1, 11);
  //  }

  public Tamagochi() {
    x = random.nextInt(0, 5);
    y = random.nextInt(0, 7);
    this.futterstand = random.nextInt(1, 11);
  }

  //  public Tamagochi() {
  //  }

  public void bewegen(String richtung) {
    if (futterstand > 0) {
      futterstand--;
    }

    if ((richtung.equals("r")) && y != spielBreit - 1) {
      y += 1;
    } else if (richtung.equals("l") && y != 0) {
      y -= 1;
    } else if (richtung.equals("u") && x != spielHoch - 1) {
      x += 1;
    } else if (richtung.equals("o") && x != 0) {
      x -= 1;
    } else {
      System.out.println("Falsche eingabe oder sie sind in der Grenze");
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

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getFutterstand() {
    return futterstand;
  }

  public void setFutterstand(int futterstand) {
    this.futterstand = futterstand;
  }
}
