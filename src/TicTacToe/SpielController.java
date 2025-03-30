package TicTacToe;

import java.util.Scanner;

public class SpielController {

  private final Scanner input;
  SpielFeld spielFeld = new SpielFeld();
  int[] userInput = new int[2];
  Spieler aktuellSpieler;
  private boolean exit = false;
  int counter;

  public SpielController(Scanner input) {
    this.input = input;
  }

  public void run() {
    initializeSpielfeld();
    Spieler spieler1 = new Spieler("Spieler 1", 'x');
    Spieler spieler2 = new Spieler("Spieler 2", 'o');

    do {

      for (int i = 0; i < 2; i++) {
        spielerInitialize(spieler1, spieler2, i);
        readUserInput(aktuellSpieler);
        updateState(aktuellSpieler);
        if (exit) {
          break;
        }
      }
    } while (!exit);
  }

  private void spielerInitialize(Spieler spieler1, Spieler spieler2, int i) {
    if (i == 0) {
      aktuellSpieler = spieler1;
    } else {
      aktuellSpieler = spieler2;
    }
  }

  private void updateState(Spieler spieler) {
    if (spielFeld.spielfeldAktuell[userInput[0]][userInput[1]] == '*') {
      spielFeld.spielfeldAktuell[userInput[0]][userInput[1]] = spieler.getSpielChar();
    } else {
      System.out.println("Dieses Feld ist besetzt");
    }

    spielFeld.spielfeldAktuell();

    resultUeberpruefung();
  }

  private void resultUeberpruefung() {

    checkHorizontal(spielFeld.spielfeldAktuell);
    checkVertikal(spielFeld.spielfeldAktuell);
    checkDiagonal(spielFeld.spielfeldAktuell);
    checkDraw();
  }

  private void checkDraw() {
    if (counter == 9) {
      System.out.println("Draw!");
      checkExit();
    }
  }

  private void checkDiagonal(char[][] feld) {
    if (((feld[0][0] == feld[1][1]) && (feld[0][0] == feld[2][2]) && (feld[0][0] != '*'))
        || ((feld[0][2] == feld[1][1]) && (feld[2][0] == feld[0][2]) && (feld[0][2] != '*'))) {
      System.out.println(aktuellSpieler.getName() + " Du hast gewonnen");
      checkExit();
    }
  }

  private void checkVertikal(char[][] feld) {
    for (int i = 0; i < feld.length; i++) {
      if ((feld[0][i] == feld[1][i]) && (feld[1][i] == feld[2][i]) && (feld[0][i] != '*')) {
        System.out.println(aktuellSpieler.getName() + " Du hast gewonnen");
        checkExit();
      }
    }
  }

  private void checkExit() {
    System.out.println("Noch eine Spiel? 0 - Nein, 1 - Ja");
    int antwort = input.nextInt();
    switch (antwort) {
      case 1:
        initializeSpielfeld();
        break;
      case 0:
        exit = true;
        break;
      default:
        System.out.println("Ungueltige Eingabe");
    }
  }

  private void checkHorizontal(char[][] feld) {
    for (char[] chars : feld) {
      if ((chars[0] == chars[1]) && (chars[1] == chars[2]) && (chars[1] != '*')) {
        System.out.println(aktuellSpieler.getName() + " Du hast gewonnen");
        checkExit();
      }
    }
  }

  private void readUserInput(Spieler spieler) {
    userInput(0, "Zeile");
    userInput(1, "Spalte");
    counter++;
  }

  private void userInput(int i, String st) {
    do {
      System.out.println(aktuellSpieler.getName() + ": Wählen Sie eine " + st + " aus: ");

      if (input.hasNextInt()) {
        int value = input.nextInt();
        if (value >= 0 && value <= 2) {
          userInput[i] = value;
          break;
        } else {
          System.out.println("Sie koennen nur 0, 1, oder 2 eingeben");
        }
      } else {
        System.out.println("Wrong input! Sie koennen nur 0, 1, oder 2 eingeben");
        input.next();
      }
    } while (true);
  }

  private void initializeSpielfeld() {
    spielFeld.spielfeldStart();
  }
}
