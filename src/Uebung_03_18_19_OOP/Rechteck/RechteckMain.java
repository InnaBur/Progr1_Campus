package Uebung_03_18_19_OOP.Rechteck;

import java.util.Scanner;

public class RechteckMain {

  public static void main(String[] args) {

    Rechteck rechteck1 = new Rechteck(23.5, 12);
    Rechteck rechteck2 = new Rechteck(4, 5.1);

    // Alternative Variante mit Scanner
   /*  Rechteck rechteck = new Rechteck();
    Scanner scanner = new Scanner(System.in);
    double wR1 = scanner.nextDouble();
    double hR1 = scanner.nextDouble();
    rechteck.setHeight(hR1);
    rechteck.setWidth(wR1);
    Rechteck r = new Rechteck(wR1, hR1);
    System.out.println("AREA " + r.getArea());

    */

    double sR1 = rechteck1.getArea();
    double sR2 = rechteck2.getArea();

    double pR1 = rechteck1.getPerimeter();
    double pR2 = rechteck2.getPerimeter();

    System.out.println("Der Umfang des Rechtecks 1 ist " + pR1 + " und die Flaeche ist " + sR1);
    System.out.println("Der Umfang des Rechtecks 2 ist " + pR2 + " und die Flaeche ist " + sR2);
  }
}
