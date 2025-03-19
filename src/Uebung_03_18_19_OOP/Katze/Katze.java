package Uebung_03_18_19_OOP.Katze;

import Uebung_03_18_19_OOP.Hund.Hund;

public class Katze {

  String name;
  int alter;
  String rasse;

  public Katze(String name, int alter, String rasse) {
    this.name = name;
    this.alter = alter;
    this.rasse = rasse;
  }

  public void knurren() {
    System.out.println("knurr");
  }

  public void hundWeglaufen(Hund hund) {
    if (hund.getName().equals("Foxi")) {
      System.out.println("Es ist mein Freund");
    } else {
      System.out.println("Kenne ich nicht, weglaufen!");
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAlter() {
    return alter;
  }

  public void setAlter(int alter) {
    this.alter = alter;
  }

  public String getRasse() {
    return rasse;
  }

  public void setRasse(String rasse) {
    this.rasse = rasse;
  }
}
