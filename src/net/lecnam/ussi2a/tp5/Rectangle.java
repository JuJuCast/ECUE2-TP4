package net.lecnam.ussi2a.tp5;

public class Rectangle extends Figures implements Inclinable {
    protected double longueur;
    protected double largeur;
    protected Point point;
    protected double angle;

    // Constructeurs existants
    public Rectangle(double longueur, double largeur, Point point) {
        this(longueur, largeur, point, 0.0);
    }

    public Rectangle(double longueur, double largeur, double x, double y) {
        this(longueur, largeur, new Point(x, y), 0.0);
    }

    // Nouveaux constructeurs avec angle
    public Rectangle(double longueur, double largeur, Point point, double angle) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.point = point;
        this.angle = angle;
    }

    public Rectangle(double longueur, double largeur, double x, double y, double angle) {
        this(longueur, largeur, new Point(x, y), angle);
    }

    // Méthodes de l'interface Inclinable
    @Override
    public double getAngle() {
        return this.angle;
    }

    @Override
    public void pivoter(double degres) {
        this.angle += degres;
    }

    // Méthodes héritées de Figures
    @Override
    public double retourneSurface() {
        return this.longueur * this.largeur;
    }

    @Override
    public double retournePerimetre() {
        return 2 * (this.longueur + this.largeur);
    }

    @Override
    public void translate(double dx, double dy) {
        this.point.translate(dx, dy);
    }

    @Override
    public boolean contient(Point point) {
        // Logique pour rectangle non incliné (ou déplacée depuis RectangleIncline si tu gères les angles)
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
        return Double.compare(rectangle.longueur, longueur) == 0
                && Double.compare(rectangle.largeur, largeur) == 0
                && Double.compare(rectangle.angle, angle) == 0
                && this.point.equals(rectangle.point);
    }

    @Override
    public String toString() {
        return "Rectangle [longueur=" + longueur + ", largeur=" + largeur
                + ", point=" + point + ", angle=" + angle + "°]";
    }
}