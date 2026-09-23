package fr.alkendi.salma;

public class testCenter {

    public static void main(String[] args) {

        Point p1 = new Point(3, -1);
        Point o = new Point(2, 3);
        Point p3 = new Point(-1, 5);

        Cercle c1 = new Cercle(p1, 1);
        Cercle c2 = new Cercle(o, 4);
        Cercle c3 = new Cercle(-1, 5, 2.5, "bleu");

        c1.mon_etat();
        c2.mon_etat();
        c3.mon_etat();

        System.out.println("Périmètre de c2 : " + c2.getPerimetre());
        System.out.println("Surface de c2 : " + c2.getSurface());

        System.out.println("o est dans c3 ? " + c3.contient(o));

        System.out.println("c2 plus grand que c3 ? " + c2.estPlusGrandQue(c3));

        System.out.println("Nombre de cercles créés : " + Cercle.getNbCercles());
    }
}