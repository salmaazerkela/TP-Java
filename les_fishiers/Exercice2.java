package les_fishiers;

import java.io.*;

public class Exercice2 {

    public static void main(String[] args) throws IOException {
    	
    	File rep = new File("tp_fichiers");
        if (!rep.exists()) {
            rep.mkdirs();
        }

        PrintWriter pw = new PrintWriter(
                new FileWriter("tp_fichiers/produits.txt"));


        pw.println("1;Ordinateur;5600.0");
        pw.println("2;Imprimante;1200.5");
        pw.println("3;Clavier;150.0");
        pw.println("4;Ecran;1800.0");

        
        
        
        pw.close();
    
    BufferedReader br = new BufferedReader(
            new FileReader("tp_fichiers/produits.txt"));

    String ligne;

    int compteur = 0;
    double total = 0;

    double max = 0;
    String produitCher ="" ;

    while ((ligne = br.readLine()) != null) {

        String[] tab = ligne.split(";");

        int num = Integer.parseInt(tab[0]);
        String designation = tab[1];
        double prix = Double.parseDouble(tab[2]);

        System.out.println(num + " -- " + designation
                + " -- " + prix + " DH");

        compteur++;
        total += prix;

        if (prix > max) {
            max = prix;
            produitCher = designation;
        }
    }

    System.out.println("Nombre de produits : " + compteur);
    System.out.println("Prix total : " + total);
    System.out.println("Produit le plus cher : " + produitCher);

    br.close();//machimochkil hta ila drt close 9bal mn l'affichage 
    
    
    FileWriter fw = new FileWriter(
            "tp_fichiers/produits.txt", true);

    fw.write("5;Souris;80.0\n");

    fw.close();
    
    FileReader fr = new FileReader(
            "tp_fichiers/produits.txt");

    int c;
    int nbCaracteres = 0;
    int nbLignes = 0;

    while ((c = fr.read()) != -1) {

        nbCaracteres++;

        if (c == '\n') {
            nbLignes++;
        }
    }

    System.out.println("Caractères : " + nbCaracteres);
    System.out.println("Lignes : " + nbLignes);

    fr.close();
    
    
}}
