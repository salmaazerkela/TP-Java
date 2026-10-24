package com.entreprise.app;

import com.entreprise.compta.Facture;

public class DecouverteExceptions {
    public static void main(String[] args) {
        try {
            double[] primes = new double[3];
            primes[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
        }

        try {
            double m = Double.parseDouble("abc");
            System.out.println(m);
        } catch (NumberFormatException e) {
            System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
        }

        try {
            Facture f = null;
            f.getMontantAPayer();
        } catch (NullPointerException e) {
            System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
        }

        try {
            int partParPersonne = 9000 / 0;
            System.out.println(partParPersonne);
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
        } finally { 
            System.out.println("Fin des essais");
        }

        
        double resultat = 9000.0 / 0;
        System.out.println("9000.0 / 0 = " + resultat);

        
    }
}