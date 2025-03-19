package Uebung_03_18_19_OOP.Teilnehmer;

public class Teilnehmer {

  private String name;
  private int alter;
  private String adresse;
  private int counter = 0;

  public Teilnehmer() {
  }

  Teilnehmer(String name, int alter) {
    this.name = name;
    this.alter = alter;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAlter() {
    return alter;
  }

  public void setAlter(int alter) {
    this.alter = alter;
  }

  public String getAdresse() {
    return adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  public void hatFrageGestellt() {
    counter++;
  }

  public int rueckgabeFragenCounter() {
    System.out.println("Fragen " + counter);
    return counter;
  }

  public void teilnehmerInfo() {
    System.out.println("Teilnehmer " + name + " hat " + alter + " Jahren" + " und wohnt in " +
            adresse + ". " + name + " hat " + counter + " Fragen gestellt");

  }

}
