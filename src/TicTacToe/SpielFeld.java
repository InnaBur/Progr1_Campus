package TicTacToe;

public class SpielFeld {

    private static final int SPIEL_BREIT = 3;
    private static final int SPIEL_HOCH = 3;
    char[][] spielfeldAktuell;

    public SpielFeld() {
        this.spielfeldAktuell = new char[SPIEL_BREIT][SPIEL_HOCH];
    }

    public void spielfeldStart() {
        for (int i = 0; i < spielfeldAktuell.length; i++) {
            for (int j = 0; j < spielfeldAktuell[i].length; j++) {
                spielfeldAktuell[i][j] = '*';
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public void spielfeldAktuell() {
        for (char[] row : spielfeldAktuell) {
            for (char ch : row) {
                System.out.print(" " + ch);
            }
            System.out.println();
        }
    }
}
