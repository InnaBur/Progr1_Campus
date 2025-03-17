package Part2;

import java.util.Scanner;

public class Userlogin {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String nameWahr = "Inna";
    String passWahr = "Inna";
    String name = "";
    String pass = "";
    int count = 0;

    do {
      if (count < 3) {
        System.out.println("Geben Sie bitte Ihr Username ein?");
        name = scanner.next();

        System.out.println("Geben Sie bitte Ihr Passwort ein?");
        pass = scanner.next();
        count++;
        if (nameWahr.equals(name) && (passWahr.equals(pass))) {
          System.out.println("Sie sind einloggen");
        } else {
          System.out.println(
              "Falscher Benutzername oder falsches Passwort. Bitte versuchen Sie es erneut.");
        }
      } else {
        System.out.println("Maximale Anzahl von Versuchen erreicht. Programm beenden");
        break;
      }
    } while (!nameWahr.equals(name) || (!passWahr.equals(pass)));
  }
}
