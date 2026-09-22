package net.lecnam.ussi2a.tp5;


public class Triangle extends Figures {
    // Attributs
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1,Point point2,Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public void translate(double x, double y) {
        this.point1.translate(x, y);
        this.point2.translate(x, y);
        this.point2.translate(x, y);
    }

    public double retournePerimetre() {
        double a = this.point1.retourneDistance(this.point2);
        double b = this.point2.retourneDistance(this.point3);
        double c = this.point3.retourneDistance(this.point1);

        return a + b + c;
    }
    public double retourneSurface() {
        double s = this.retournePerimetre() / 2.0;

        double a = this.point1.retourneDistance(this.point2);
        double b = this.point2.retourneDistance(this.point3);
        double c = this.point3.retourneDistance(this.point1);

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public boolean contient(Point p) {
        double ab = this.point1.retourneDistance(this.point2);
        double bc = this.point2.retourneDistance(this.point3);
        double ac = this.point3.retourneDistance(this.point1);

        double pTriangle = this.retournePerimetre();

        double ma = p.retourneDistance(this.point1);
        double mb = p.retourneDistance(this.point2);
        double mc = p.retourneDistance(this.point3);

        double sommeDistances = ma + mb + mc;

        double infCote = Math.min(ab, Math.min(bc, ac));

        boolean borneInferieure = (pTriangle / 2.0) <= sommeDistances;
        boolean borneSuperieure = sommeDistances <= (pTriangle - infCote);

        return borneInferieure && borneSuperieure;
    }

    public String toString() {
        return "Triangle [p1=" + this.point1 + ", p2=" + this.point2 + ", p3=" + this.point3 + "]";
    }

    public static void main(String[] args) {
        Point p1 = new Point(0.0, 0.0);
        Point p2 = new Point(4.0, 0.0);
        Point p3 = new Point(0.0, 3.0);

        Triangle t = new Triangle(p1, p2, p3);

        System.out.println("--- Test du Triangle ---");
        System.out.println(t);
        System.out.println("Périmètre : " + t.retournePerimetre());
        System.out.println("Surface : " + t.retourneSurface());

        Point dedans = new Point(1.0, 1.0);
        Point dehors = new Point(5.0, 5.0);

        System.out.println("Le point (1,1) est dans le triangle ? " + t.contient(dedans));
        System.out.println("Le point (5,5) est dans le triangle ? " + t.contient(dehors));
    }
}