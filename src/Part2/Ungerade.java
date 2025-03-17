package Part2;

import java.util.Scanner;

public class Ungerade {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Zahl ");
    int zahl = scanner.nextInt();

    for (int i = 1; i <= zahl; i++) {
      if (i % 2 != 0) {
        System.out.print(i + " ");
      }
    }
  }
}
