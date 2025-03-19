package Uebung_03_18_19_OOP;

public class Hund1 {

    String rasse;
    String name;
    String farbe;
    char geschlecht;
    boolean impfungen;
    int alterM;
    int alterH;

    public void bellen () {
    System.out.println("Bark!");
  }

    public void beissen () {
        System.out.println("Beiss!");
    }

    public void ballHolen () {
        System.out.println("Ich hole das Ball!");
    }

    public void laufen() {
        System.out.println("Ich laufe!");
    }

    public void essen () {
        System.out.println("Ich habe Hunger! Mnjam!");
    }

    public void trick () {
        System.out.println("Ich mache Trick!");
    }

    public void altBerechnen () {
        alterM = alterH * 5;
        System.out.println("Ich habe " + alterM + " menschlichen Jahren!");
    }
}
