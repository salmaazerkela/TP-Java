
package com.geometrie.formes;

import com.geometrie.base.Point;

public class Carre extends Rectangle {

    public Carre(Point centre, double cote, String couleur) {
        super(centre, cote, cote, couleur); // appel au constructeur parent
    }

    public double getCote() {
    	return getLargeur();
    	}

    @Override
    public String getNom() {
    	return "Carre";
    	}

}