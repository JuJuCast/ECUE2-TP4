package net.lecnam.ussi2a.tp5;

public class Rectangle extends Figures {

    double longueur;
    double largeur;
    Point point;

    Rectangle(double longueur, double largeur, Point point) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.point = point;
    }

    Rectangle(double longueur, double largeur, double x, double y) {
        this(longueur, largeur, new Point(x, y));
    }

    @Override
    public double retourneSurface() {
        return this.longueur * this.largeur;
    }

    @Override
    public double retournePerimetre() {
        return 2 * (this.longueur + this.largeur);
    }

    @Override
    public void translate(double x, double y) {
        this.point.translate(x, y);
    }

    @Override
    public boolean contient(Point point) {
        return point.x >= this.point.x
                && point.x <= this.point.x + longueur
                && point.y >= this.point.y
                && point.y <= this.point.y + largeur;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        return this.point.equals(rectangle.point)
                && this.longueur == rectangle.longueur
                && this.largeur == rectangle.largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", point=" + point +
                ", surface=" + this.retourneSurface() +
                '}';
    }
}