package com.geometrie.formes;

import com.geometrie.base.Point;

public class Rectangle extends Forme {
    private double largeur;
    private double hauteur;

    public Rectangle(Point centre, double largeur, double hauteur, String couleur) {
        super(centre, couleur); 
        this.largeur = (largeur <= 0) ? 1 : largeur;
        this.hauteur = (hauteur <= 0) ? 1 : hauteur;
    }

    public double getLargeur() { 
    	return largeur; 
    }
    
    
    public double getHauteur() { 
    	return hauteur; 
    	}
    
    

    @Override 
    public String getNom() { return "Rectangle"; }

    @Override
    public double getPerimetre() { return 2 * (largeur + hauteur); }

    @Override
    public double getSurface() { return largeur * hauteur; }

    @Override
    public String toString() {
        return getNom() + "[" + super.toString()
             + ", largeur=" + largeur + ", hauteur=" + hauteur + "]";
    }
}