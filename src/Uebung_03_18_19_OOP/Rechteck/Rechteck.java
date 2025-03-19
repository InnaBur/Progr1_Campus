package Uebung_03_18_19_OOP.Rechteck;

public class Rechteck {

    double width;
    double height;

    public Rechteck() {
    }

    public Rechteck(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width*height;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

}
