package Tamagochi;

import java.util.Random;

public class Spielplatz {

  private static final int spielBreit = 7;
  private static final int spielHoch = 5;
  int width;
  int height;

  public Spielplatz() {
    this.width = spielBreit;
    this.height = spielHoch;
  }

  public void spielfieldZeichnen(int x, int y) {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if ((i == x) && (j == y)) {
          System.out.print("O ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }

  public void neuenSpielfieldZeichnen(int x, int y,  int xP, int yP) {

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if ((i == x) && (j == y)) {
          System.out.print("O ");
        } else if ((i == xP) && (j == yP)) {
          System.out.print("! ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}
