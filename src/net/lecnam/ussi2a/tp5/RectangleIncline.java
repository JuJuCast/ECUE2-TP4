package net.lecnam.ussi2a.tp5;

public class RectangleIncline extends Rectangle {
    private double angle;

    public RectangleIncline(double longueur, double largeur, Point point, double angle) {
        super(longueur, largeur, point);
        this.angle = angle;
    }

    public RectangleIncline(double longueur, double largeur, double x, double y, double angle) {
        super(longueur, largeur, x, y);
        this.angle = angle;
    }

}
