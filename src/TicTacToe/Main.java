package TicTacToe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SpielController spielController = new SpielController(input);
        spielController.run();
    }
}