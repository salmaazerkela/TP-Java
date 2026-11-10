package les_fishiers;

import java.io.*;
                                     
public class Exercice3 {

  
    static void copierAvecNumeros(String source, String dest)
            throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader(source));

        BufferedWriter bw = new BufferedWriter(
                new FileWriter(dest));

        String ligne;
        int numero = 1;

        while ((ligne = br.readLine()) != null) {

            bw.write(numero + ": " + ligne);
            bw.newLine();

            numero++;
        }

        br.close();
        bw.close();
    }

   
    static long copierBinaire(String source, String dest)
            throws IOException {

    	File dossier = new File("tp_fichiers/archives");
        if (!dossier.exists()) {
            dossier.mkdirs();
        }
    	
    	
        FileInputStream fis = new FileInputStream(source);

        FileOutputStream fos = new FileOutputStream(dest);

        int octet;
        long compteur = 0;

        while ((octet = fis.read()) != -1) {

            fos.write(octet);
            compteur++;
        }

        fis.close();
        fos.close();

        return compteur;
    }

    public static void main(String[] args) throws IOException {

        copierAvecNumeros(
                "tp_fichiers/produits.txt",
                "tp_fichiers/produits_num.txt");

        long taille = copierBinaire(
                "tp_fichiers/produits.txt",
                "tp_fichiers/archives/produits_copie.txt");

        File original = new File("tp_fichiers/produits.txt");

        File copie = new File(
                "tp_fichiers/archives/produits_copie.txt");

        System.out.println("Octets copiés : " + taille);

        System.out.println("Taille original : "
                + original.length());

        System.out.println("Taille copie : "
                + copie.length());
    }
}           