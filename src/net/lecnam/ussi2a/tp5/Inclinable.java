package net.lecnam.ussi2a.tp5;

public interface Inclinable {
    double getAngle();
    void pivoter(double degres);
}

/*
 * 1. Pourquoi l'attribut angle ne peut pas être dans l'interface ?
 * En Java, les variables d'une interface sont obligatoirement 'static final' (ce sont des constantes).
 * On ne peut pas y stocker un état propre à chaque objet.
 *
 * 2. Carre peut-il être incliné et qu'a-t-il fallu écrire ?
 * Oui, par héritage direct de Rectangle. Il a juste fallu ajouter des constructeurs
 * dans Carre qui transmettent l'angle via super(...).
 *
 * 3. Disque et Triangle doivent-ils être Inclinables ?
 * - Disque : Non, un cercle pivoté reste identique (symétrie centrale).
 * - Triangle : Oui, l'orientation change la position de ses sommets.
 */