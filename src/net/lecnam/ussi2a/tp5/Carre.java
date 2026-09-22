package net.lecnam.ussi2a.tp5;

public class Carre extends Rectangle {


    public Carre(double cote, Point point) {
        super(cote, cote, point);
    }


    public Carre(double cote, double x, double y) {
        super(cote, cote, x, y);
    }


    public String toString() {
        return "Carre [cote=" + this.longueur + ", point=" + this.point + "]";
    }
}