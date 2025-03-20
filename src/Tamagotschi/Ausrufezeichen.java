package Tamagotschi;

import java.util.Random;

public class Ausrufezeichen {

    Random random = new Random();
    int x_Point;
    int y_Point;
    Tamagochi tamagochi;

    public Ausrufezeichen() {
       aktualisierePosition();
    }


    public void ueberpruefenUndAktualisieren(int tamagochiX, int tamagochiY) {
        if (tamagochiX == x_Point && tamagochiY == y_Point) {
            aktualisierePosition();
        }
    }

    private void aktualisierePosition() {
        this.x_Point = random.nextInt(5);
        this.y_Point = random.nextInt(7);
    }
}
