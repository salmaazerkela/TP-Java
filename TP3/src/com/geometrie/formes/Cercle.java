package com.geometrie.formes;

import com.geometrie.base.Point;

public class Cercle extends Forme {

    private double rayon;

    public double getRayon() {
        return rayon;
    }

    public Cercle(Point centre, double rayon) {
        super(centre);

        if (rayon <= 0)
            this.rayon = 1;
        else
            this.rayon = rayon;
    }

    public Cercle(Point centre, double rayon, String couleur) {
        super(centre, couleur);

        if (rayon <= 0)
            this.rayon = 1;
        else
            this.rayon = rayon;
    }

    @Override
    public String getNom() {
        return "Cercle";
    }

    @Override
    public double getPerimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double getSurface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public String toString() {
        return getNom() +"["+super.toString() + ", rayon = " + rayon+"]";
    }
}
