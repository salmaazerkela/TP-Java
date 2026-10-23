package com.geometrie.formes;

import com.geometrie.base.Point;

public class Program {
    public static void main(String[] args) {
        Forme[] formes = new Forme[4];
        formes[0] = new Cercle(new Point(2, 3), 4);
        formes[1] = new Rectangle(new Point(0, 0), 6, 3, "rouge");
        formes[2] = new Carre(new Point(-1, 5), 5, "bleu");
        formes[3] = new Cercle(new Point(1, 1), -2, "vert");
        formes[1].deplacer(1, -2);

        for (Forme f : formes) {
            System.out.println(f);
        }

        double total = 0;
        for (Forme f : formes) { // polymorphisme + liaison dynamique
            System.out.println("Surface de " + f.getNom() + " : " + f.getSurface());
            total += f.getSurface();
        }
        System.out.println("Surface totale : " + total);

        Forme max = formes[0];
        for (Forme f : formes) {
            if (f.estPlusGrandeQue(max)) max = f;
        }
        System.out.println("Plus grande forme : " + max);

        int nbCercles = 0;
        for (Forme f : formes) {
            if (f instanceof Cercle) nbCercles++;
        }
        System.out.println("Nombre de cercles : " + nbCercles);

        // formes[2].getCote(); // refusé : le type déclaré est Forme, pas Carre
        Carre k = (Carre) formes[2]; // cast
        System.out.println("Côté du carré : " + k.getCote());

        System.out.println("Nombre de formes créées : " + Forme.getNbFormes());
    }
}