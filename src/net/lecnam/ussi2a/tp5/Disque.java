package net.lecnam.ussi2a.tp5;


public class Disque extends Figures {
    // Attributs
    private Point centre;
    private double rayon;

    // Constructeur 1 : avec un objet Point existant et le rayon
    public Disque(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    // Constructeur 2 : avec les coordonnées x, y et le rayon
    public Disque(double x, double y, double rayon) {
        this.centre = new Point(x, y);
        this.rayon = rayon;
    }

    // Déplace le disque en translatant son centre
    public void translate(double x, double y) {
        this.centre.translate(x, y);
    }

    // Calcule et retourne la surface du disque (π * r²)
    public double retourneSurface() {
        return Math.PI * this.rayon * this.rayon;
    }

    // Calcule et retourne le périmètre du disque (2 * π * r)
    public double retournePerimetre() {
        return 2 * Math.PI * this.rayon;
    }

    // Retourne vrai si le point donné est à l'intérieur du disque
    public boolean contient(Point p) {
        return this.centre.retourneDistance(p) <= this.rayon;
    }

    // Retourne une chaîne qui décrit le disque
    @Override
    public String toString() {
        return "Disque [centre=" + this.centre + ", rayon=" + this.rayon + "]";
    }

    // Méthode main pour tester la classe
    public static void main(String[] args) {
        // Création d'un disque au centre (0,0) avec un rayon de 5.0
        Disque d1 = new Disque(0.0, 0.0, 5.0);

        System.out.println("--- Test du Disque ---");
        System.out.println(d1);
        System.out.println("Surface : " + d1.retourneSurface());
        System.out.println("Périmètre : " + d1.retournePerimetre());

        // Test de présence d'un point dans le disque
        Point p1 = new Point(3.0, 3.0);
        Point p2 = new Point(6.0, 6.0);

        System.out.println("Le point (3,3) est dans le disque ? " + d1.contient(p1));
        System.out.println("Le point (6,6) est dans le disque ? " + d1.contient(p2));

        // Translation
        d1.translate(2.0, 2.0);
        System.out.println("Après translation (dx=2, dy=2) : " + d1);
    }
}