package TikTakToe;

import java.util.Scanner;

public class TTT {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    char[][] brettAktuell = new char[3][3];
    boolean isFertig = true;
    int zeile;
    int spalte;


    brettStart(brettAktuell);

    do {

      System.out.println("Spieler 1: Wählen Sie eine Zeile aus: ");
      zeile = scanner.nextInt();
      System.out.println("Spieler 1: Wählen Sie eine Spalte aus: ");
      spalte = scanner.nextInt();


      if (brettAktuell[zeile][spalte] == '*') {
        brettAktuell[zeile][spalte] = 'x';
      } else {
        System.out.println("Dieses Feld ist besetzt");
      }

      for (int i = 0; i < brettAktuell.length; i++) {
        for (int j = 0; j < 1; j++) {
          if ((brettAktuell[i][j] == brettAktuell[i][j+1]) &&  (brettAktuell[i][j+1] == brettAktuell [i][j+2]) && (brettAktuell[i][j+1]!= '*')){
            System.out.println("Du hast gewonnen");
            isFertig = false;
          }
        }
      }

      int i = 0;
      int j = 0;
       if((brettAktuell[i][j] == brettAktuell[i+1][j+1]) && (brettAktuell[i][j] == brettAktuell[i+2][j+2]) && (brettAktuell[i][j+1]!= '*')){
        System.out.println("Du hast gewonnen");
        isFertig = false;
      }

      if (isFertig == false) {
        break;
      }

      brettAktuell(brettAktuell);

      System.out.println("Spieler 2: Wählen Sie eine Zeile aus: ");
      zeile = scanner.nextInt();
      System.out.println("Spieler 2: Wählen Sie eine Spalte aus: ");
      spalte = scanner.nextInt();


      if (brettAktuell[zeile][spalte] == '*') {
        brettAktuell[zeile][spalte] = 'o';
      } else {
        System.out.println("Dieses Feld ist besetzt");
      }

      brettAktuell(brettAktuell);
      //          if (brettAktuell[zeile][spalte] == '*') {
      //            brettAktuell [zeile][spalte] = 'x';
      //            System.out.println("e");
      //          }

      //      if (zeile != 0 || zeile != 1 || zeile != 2) {
      //        System.out.println("Sie haben falsche Zahle eingegeben");
      //      }

    } while (isFertig);
  }

  private static void brettAktuell(char[][] brettAktuell) {
    for (char[] row : brettAktuell) {
      for (char ch : row) {
        System.out.print(" " + ch);
      }
      System.out.println();
    }
  }

  private static void brettStart(char[][] brettAktuell) {
    for (int i = 0; i < brettAktuell.length; i++) {
      for (int j = 0; j < brettAktuell[i].length; j++) {
        brettAktuell[i][j] = '*';
        System.out.print(" *");
      }
      System.out.println();
    }
  }
}
