package Tamagotschi;

import java.util.Random;

public class Ausrufezeichen {

    Random random = new Random();
    int x_Point;
    int y_Point;
    Tamagotschi tamagochi;

    public Ausrufezeichen() {
       aktualisierePosition();
    }


    public void ueberpruefenUndAktualisieren(int tamagochiX, int tamagochiY) {
        if (tamagochiX == x_Point && tamagochiY == y_Point) {
            aktualisierePosition();
        }
    }

    private void aktualisierePosition() {
        x_Point = random.nextInt(5);
        y_Point = random.nextInt(7);
    }
}
