package Tamagochi;

public class Tamagochi {

  private static final int spielBreit = 7;
  private static final int spielHoch = 5;
  Spielplatz spielplatz = new Spielplatz(spielHoch, spielBreit);
  int x;
  int y;
  int futterstand;

  public Tamagochi() {}

  public Tamagochi(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void bewegen(String richtung) {
    if (futterstand > 0) {
      futterstand--;
    } else {
      System.out.println("Keine Essen mehr!");
    }


    if ((richtung.equals("r")) && y != spielBreit - 1) {
      y += 1;
    } else if (richtung.equals("l") && y != 0) {
      y -=1;
    } else if (richtung.equals("u") && x != spielBreit - 1) {
      x +=1;
    } else if (richtung.equals("o") && x != 0) {
      x -=1;
    }
    else {
      System.out.println("Falsche eingabe");
    }
    spielplatz.spielfieldZeichnen(x, y);
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
