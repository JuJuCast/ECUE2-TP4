package net.lecnam.ussi2a.tp5;

public abstract class Figures {

    public abstract double retourneSurface();

    public abstract double retournePerimetre();

    public abstract void translate(double x, double y);

    public abstract boolean contient(Point p);
}