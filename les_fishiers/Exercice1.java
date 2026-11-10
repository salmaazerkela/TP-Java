package les_fishiers;
import java.io.File;
import java.io.IOException;
class Exercice1 {

	public static void main(String[] args)  throws IOException {
		                  //3la hsab rep dyalk 
		    String rep = "C:\\Users\\hp\\tp_fichiers";
			File f = new File(rep);
			if (!(f.exists())) {
				f.mkdir ();
				
		    }
			System.out.println("repertoir cree :"+f.getAbsolutePath()); 
	
			File f1 =new File(f,"a.txt");
			File f2 =new File(f,"b.txt");
            
            f1.createNewFile();
            f2.createNewFile();
            
            
            File archives =new File(rep,"archives");
            archives.mkdir();
            
            
            
            String[] contenu = f.list();
            int nbRep=0 ;
            int nbfishie=0;
            for (int i = 0; i < contenu.length; i++) {  //for(string nom: contenu)
            File fe = new File(rep, contenu[i]); //f shih walakin mn ahsan ikon string bhal contenu[i]
            if (fe.isDirectory()) {
             System.out.println("[REP]    " + contenu[i]); //fe.getName ou nom ila drt foreach 
             nbRep++;
            }else {                              //nom
              System.out.println("[Fichier] " + contenu[i] + " Size: " + fe.length()+" octects ");
			  nbfishie++;
            } 
	}       System.out.println(nbfishie+"  fichier(s)," +nbRep+ " répertoire(s)");
	}
	}
