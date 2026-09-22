package net.lecnam.ussi2a.tp5;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Exec {

    static Dessin dessin = new Dessin();

    public static void main(String[] args) {

        Rectangle r = new Rectangle(2, 3, 1.2, 9);
        Disque d = new Disque(0, 0, 5); // Surface ≈ 78.54
        Point point = new Point(0,0);

        dessin.ajout(r);
        dessin.ajout(d);

        System.out.println("Surface totale : " + dessin.retourneSurfaceTotale());
        System.out.println("Plus grande figure : " + dessin.retournePlusGrand());
        System.out.println("Le point est contenu dans les figures: "+dessin.contient(point));

        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(0, 3);

        Point p4 = new Point(1, 1);
        Point p5 = new Point(7, 1);
        Point p6 = new Point(4, 5);

        Point p7 = new Point(-2, -1);
        Point p8 = new Point(10, 0);
        Point p9 = new Point(2, 8);

        Triangle t1 = new Triangle(p1, p2, p3);
        Triangle t2 = new Triangle(p4, p5, p6);
        Triangle t3 = new Triangle(p7, p8, p9);

        Figures[] figures = { t1, t2, t3 };

        double surfaceTotale = 0;
        for (Figures f : figures) {
            surfaceTotale += f.retourneSurface();
        }
        System.out.println("Surface totale des figures : " + surfaceTotale);

        Figures plusGrande = figures[0];
        for (int i = 1; i < figures.length; i++) {
            if (figures[i].retourneSurface() > plusGrande.retourneSurface()) {
                plusGrande = figures[i];
            }
        }

        System.out.println("\n--- Plus grande figure ---");
        System.out.println(plusGrande);
        System.out.println("Sa surface : " + plusGrande.retourneSurface());

    }

}
