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
    public boolean contient(Point point) {
        double a = Math.toRadians(this.angle);
        double dx = point.x - this.point.x;
        double dy = point.y - this.point.y;
        double rotx =  dx * Math.cos(a) + dy * Math.sin(a);
        double roty = -dx * Math.sin(a) + dy * Math.cos(a);
        return 0 <= rotx && rotx <= this.longueur
                && 0 <= roty && roty <= this.largeur;
    }
    public String toString() {
        return "Rectangle [longueur=" + this.longueur + ", largeur=" + this.largeur + ", point=" + this.point + ", Angle=" + this.angle + "°]";
    }

}
