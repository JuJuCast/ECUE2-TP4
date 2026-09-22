package net.lecnam.ussi2a.tp5;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Exec {

    static Dessin dessin = new Dessin();

    public static void main(String[] args) {

        Rectangle r = new Rectangle(2, 3, 1.2, 9);
        Disque d = new Disque(0, 0, 5); // Surface ≈ 78.54

        dessin.ajout(r);
        dessin.ajout(d);

        System.out.println("Surface totale : " + dessin.retourneSurfaceTotale());
        System.out.println("Plus grande figure : " + dessin.retournePlusGrand());
    }

}
