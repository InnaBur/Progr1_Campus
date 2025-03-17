package Uebung_10March;

import java.util.Scanner;

public class Strafe {

  public static void StrafeRechnung() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Geschwindigkeit: ");
    int speed = sc.nextInt();

    System.out.println("Alkogolpegel: ");
    double alko = sc.nextDouble();

    System.out.println("Welcher Monat ist es: ");
    String monat = sc.next();

    double strafe = AlkoStrafe(alko) + SpeedStrafe(speed);
    System.out.println("Ihre Strafe ist " + strafe);

    if (strafe > 0) {
      StrafeRabatt(monat, strafe);
    }
  }

  private static void StrafeRabatt(String monat, double strafe) {
    switch (monat.toLowerCase()) {
      case ("maerz"):
      case ("april"):
        strafe = strafe * 0.9;
        System.out.println(
                "Aber! Heute ist " + monat + " Sie bekommen 10% Rabbat und Ihre Strafe ist " + strafe);
        break;

      case ("mai"):
      case ("juni"):
        strafe = strafe * 0.85;
        System.out.println(
                "Aber! Heute ist " + monat + " Sie bekommen 15% Rabbat und Ihre Strafe ist " + strafe);
        break;

      case ("juli"):
      case ("august"):
        strafe = strafe * 0.8;
        System.out.println(
                "Aber! Heute ist " + monat + " Sie bekommen 20% Rabbat und Ihre Strafe ist " + strafe);
        break;

      case ("september"):
      case ("oktober"):
        strafe = strafe * 0.75;
        System.out.println(
                " Aber! Heute ist " + monat + " Sie bekommen 25% Rabbat und Ihre Strafe ist " + strafe);
        break;

      case ("november"):
      case ("dezember"):
        strafe = strafe * 0.7;
        System.out.println(
                " Aber! Heute ist " + monat + " Sie bekommen 30% Rabbat und Ihre Strafe ist " + strafe);
        break;

      default:
        System.out.println("Sie bekommen keine Strafe-Rabbat");
    }
  }

  public static int SpeedStrafe(int speed) {
    int erlaubtSpeed = 50;
    int uberSpeed = speed - erlaubtSpeed;
    int strafeSpeed = 0;

    if (uberSpeed > 0 && uberSpeed <= 10) {
      System.out.println("Fûr Geschwindigkeit bekommen Sie nur schriftliche Verwarnung!");
    } else if (uberSpeed > 10 && uberSpeed <= 20) {
      strafeSpeed = SpeedStrafeRechner(strafeSpeed, 30);
    } else if (uberSpeed > 20 && uberSpeed <= 30) {
      strafeSpeed = SpeedStrafeRechner(strafeSpeed, 50);
    } else if (uberSpeed > 30 && uberSpeed <= 50) {
      strafeSpeed = SpeedStrafeRechner(strafeSpeed, 100);
    } else if (uberSpeed > 50 && uberSpeed <= 100) {
      strafeSpeed = SpeedStrafeRechner(strafeSpeed, 500);
    } else if (uberSpeed > 100) {
      strafeSpeed = SpeedStrafeRechner(strafeSpeed, 1500);
    } else {
      System.out.println("Alles gut mit Geschwindigkeit!");
    }
    return strafeSpeed;
  }

  private static int SpeedStrafeRechner(int strafeSpeed, int i) {
    System.out.println("Sie bekommen Geschwindigkeit-Strafe! Zahlen Sie bitte " + i + " €");
    return strafeSpeed + i;
  }

  public static int AlkoStrafe(double alko) {
    int alkoStrafe = 0;
    double erlaubtAlko = 1.2;
    double uberAlko = alko - erlaubtAlko;
    if (uberAlko <= 0.5) {
      System.out.println("Alles ok mit Alko!");
    } else if (uberAlko >= 0.6 && uberAlko <= 1.0) {
      alkoStrafe = alkoStrafe + 50;
      System.out.println("Sie bekommen Alko-Strafe! Zahlen Sie bitte " + 50 + " €");
    } else if (uberAlko >= 1.1 && uberAlko < 2.0) {
      alkoStrafe = alkoStrafe + 100;
      System.out.println("Sie bekommen Alko-Strafe! Zahlen Sie bitte " + 100 + " €");
    } else if (uberAlko >= 2.0) {
      alkoStrafe = alkoStrafe + 2500;
      System.out.println("Sie bekommen Alko-Strafe! Zahlen Sie bitte " + 2500 + " €");
    }
    return alkoStrafe;
  }
}
