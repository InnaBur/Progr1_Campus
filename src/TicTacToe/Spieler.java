package TicTacToe;

public class Spieler {

    private String name;
    private char spielChar;

    public Spieler(String name, char spielChar) {
        this.name = name;
        this.spielChar = spielChar;
    }

    public String getName() {
        return name;
    }

    public char getSpielChar() {
        return spielChar;
    }
}
