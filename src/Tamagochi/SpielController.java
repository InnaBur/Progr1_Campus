package Tamagochi;

public class SpielController {

  boolean istNotGewonnen = true;
  boolean istSpielNotFertig = true;

  public boolean istSpielerGewonnen(Tamagochi tamagochi) {

    if (tamagochi.getX() == 4 && tamagochi.getY() == 0) {
      System.out.println("You win!!!");
      istNotGewonnen = false;
    } else if (tamagochi.futterstand == 0) {
      System.out.println("Keine Essen mehr! Mochten Sie futtern?");
    }
    return istNotGewonnen;
  }

}
