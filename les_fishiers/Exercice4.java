package les_fishiers;

import java.io.*;
import java.util.ArrayList;

public class Exercice4 {

    // Sauvegarder la liste
    static void sauvegarder(ArrayList<Produit> liste, String nom)
            throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(nom));

        oos.writeObject(liste);

        oos.close();
    }

    // Charger la liste
    static ArrayList<Produit> charger(String nom)
            throws IOException, ClassNotFoundException {

        File f = new File(nom);

        if (!f.exists()) {                // Si le fichier n'existe pas, retourner une liste vide de produits et quitter la méthode.
            return new ArrayList<Produit>();
        }

        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(nom));

        ArrayList<Produit> liste =
                (ArrayList<Produit>) ois.readObject();

        ois.close();

        return liste;
    }

    public static void main(String[] args) {

        try {

            // 1. Lire produits.txt
            ArrayList<Produit> liste = new ArrayList<>();

            BufferedReader br = new BufferedReader(
                    new FileReader("tp_fichiers/produits.txt"));

            String ligne;

            while ((ligne = br.readLine()) != null) {

                String[] tab = ligne.split(";");

                int num = Integer.parseInt(tab[0]);
                String designation = tab[1];
                float prix = Float.parseFloat(tab[2]);

                Produit p = new Produit(num, designation, prix);

                liste.add(p);
            }

            br.close();

            //Sauvegarder
            String nom = "tp_fichiers/stock.dat";

            sauvegarder(liste, nom);

            System.out.println(liste.size()
                    + " produits sauvegardés");

            //Charger
            ArrayList<Produit> produits = charger(nom);

            // Ajouter Webcam
            Produit webcam = new Produit(6, "Webcam", 350);

            produits.add(webcam);

            //Sauvegarder à nouveau
            sauvegarder(produits, nom);
     

            //Recharger
            ArrayList<Produit> resultat = charger(nom);
            
      

            // Afficher
            for (Produit p : resultat) {
                System.out.println(p);
            }

        } catch (FileNotFoundException e) {

            System.out.println("Fichier introuvable : "
                    + e.getMessage());

        } catch (IOException e) {

            System.out.println("Erreur d'entrée/sortie : "
                    + e.getMessage());

        } catch (ClassNotFoundException e) {

            System.out.println("Classe introuvable : "
                    + e.getMessage());
        }
    }
}
