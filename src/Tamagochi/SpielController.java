package Tamagochi;

public class SpielController {

  boolean istFertig = false;

  public boolean istSpielFertig(Tamagochi tamagochi) {

    if (tamagochi.getX() == 4 && tamagochi.getY() == 0) {
      System.out.println("You win!!!");
      istFertig = true;
    } else if (tamagochi.futterstand == 0) {
      System.out.println("Keine Essen mehr!");
      istFertig = true;
    }
    return istFertig;
  }
}
