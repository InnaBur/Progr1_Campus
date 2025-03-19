package Uebung_03_18_19_OOP.Hund;

public class Hund {

  String name;
  int alter;
  String rasse;
  String farbe;

  public Hund() {}

  public Hund(String name, int alter, String rasse, String farbe) {
    this.name = name;
    this.alter = alter;
    this.rasse = rasse;
    this.farbe = farbe;
  }

  public void bellen() {
    System.out.println("Wuff Wuff!");
  }

  public void stoeckchenBringen(boolean kannHund) {
    if (kannHund) {
      System.out.println("Ja, Hund kann Stöckchen bringen");
    } else {
      System.out.println("Nein, Hund kann das noch nicht");
    }
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
