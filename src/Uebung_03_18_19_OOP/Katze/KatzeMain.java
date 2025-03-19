package Uebung_03_18_19_OOP.Katze;

import Uebung_03_18_19_OOP.Hund.Hund;

public class KatzeMain {

    public static void main(String[] args){

        Hund foxi = new Hund();
        foxi.setName("Foxi");

        Hund notFoxi = new Hund();
        notFoxi.setName("Dog");

        Katze katze = new Katze("Moki", 3, "Hauskatze");

        katze.knurren();
        katze.hundWeglaufen(foxi);
        katze.hundWeglaufen(notFoxi);
    }
}
