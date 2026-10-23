package com.geometrie.formes;

import com.geometrie.base.Point;

public abstract class Forme {

    protected Point centre;
    protected String couleur = "noir";
    private static int nbFormes = 0;

    public Forme(Point centre) {
        this(centre, "noire");
    }

    public Forme(Point centre, String couleur) {
        this.centre = centre;
        this.couleur = couleur;
        nbFormes++;
    }

    public abstract String getNom();

    public abstract double getPerimetre();

    public abstract double getSurface();

    public void deplacer(double dx, double dy) {
        centre.abs = centre.abs + dx;
        centre.ord = centre.ord + dy;
    }

    public static int getNbFormes() {
        return nbFormes;
    }

    @Override
    public String toString() {
        return "centre = " + centre.toString()+ ", couleur = " + couleur;
    }
    
    public boolean estPlusGrandeQue(Forme autre) {
        return this.getSurface() > autre.getSurface();
    }
   
}

