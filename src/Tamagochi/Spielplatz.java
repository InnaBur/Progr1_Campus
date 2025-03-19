package Tamagochi;

public class Spielplatz {

  int row;
  int column;

  public Spielplatz(int row, int column) {
    this.row = row;
    this.column = column;
  }

  public Spielplatz() {
  }

  public void spielfieldZeichnen(int x, int y) {
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        if ((i == x) && (j == y)) {
          System.out.print("O ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }

  public void spielfieldUpdate(int x, int y) {
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        if ((i == x) && (j == y)) {
          System.out.print("O ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}
