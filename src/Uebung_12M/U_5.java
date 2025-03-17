package Uebung_12M;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class U_5 {

  public static void main(String[] args) throws IOException {

    System.out.println(
            "Wählen Sie bitte eine Option: "
                    + "1. Umgekehrte Stringausgabe"
                    + "2. Ist Zahl gerade oder ungerade?"
                    + "3. Vokale zählen"
                    + "4. Falultät berechnen");
    Scanner scanner = new Scanner(System.in);
    int auswahl = scanner.nextInt();

    switch (auswahl) {
      case 1:

      case 2:
      case 3:
      case 4:
      case 0: break;
      default:
        System.out.println("Sie haben eine falsche Wahl getroffen");
    }

    TextLeser();
  }

  public static void Flugzeug() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcher Flugzeugtyp ist es?");
    String typ = scanner.next();

    for (int i = 1; i < 51; i++) {
      if (i == 13 || i == 17) {
        continue;
      } else {
        if (typ.equals("A380") && i == 20) {
          break;
        } else {
          System.out.println("Deiner Platz ist " + i);
        }
      }
    }
  }

  public static void TextLeser() throws IOException {

    //  File file = new File("faust.txt");
    String path = "/Users/inna/Documents/IT/SWENG_Campus02/PR1/Ubungen/faust.txt";

    Scanner scanner = new Scanner(Path.of(path));
    int counter = 0;

    Scanner scanner1 = new Scanner(System.in);
    System.out.println("Bitte geben Sie das Wort ");
    String beliebigeWort = scanner1.next().toLowerCase();

    while (scanner.hasNext()) {
      String wort = scanner.next().toLowerCase();
      if (wort.equals(beliebigeWort)) {
        counter += 1;
      }
    }

    System.out.println("Das Wort " + beliebigeWort + " kannst du " + counter + " mal treffen");
  }
}
