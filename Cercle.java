package fr.alkendi.salma;

public class Cercle {
	public Point centre ;
	public double rayon ;
	public String couleur ;
	public static int nbrCercles= 0;
	 
	public Cercle () {
		centre=new Point();
		rayon=1 ;
		couleur ="noir" ;
		nbrCercles++;
		
	}
	public Cercle (Point centre,double rayon ) {
		this.centre=centre ;
		this.rayon=rayon ;
		this.couleur="noir";
		nbrCercles++;
		
	}
	
	public Cercle (double x,double y,double rayon,String couleur) {
		this.centre=new Point(x,y) ;
		this.rayon=rayon ;
		this.couleur=couleur;
		nbrCercles++;	
	}
	public void mon_etat() {
		System.out.println("Centre[centre=("+centre.abs+","+centre.ord+"), rayon ="+rayon+", couleur="+couleur+"]");
	}
	public double getPerimetre () {
		return 	2*Math.PI*rayon;
	}
	public double getSurface () {
		return 	Math.PI*rayon*rayon;
	}
	public void deplacer (double dx,double dy) {
		centre.abs+=dx;
		centre.ord+=dy;	
	}
	public void deplacer(Point nouveauCentre) {
		centre.abs+=nouveauCentre.abs;
		centre.ord+=nouveauCentre.ord;	
	}
	public boolean contient (Point p) {
		return centre.distance(p) <= rayon;
	}
	public boolean estPlusGrandQue(Cercle autre)  {
		return this.rayon > autre.rayon;
	}
	public static int getNbCercles() {
		return nbrCercles ;
		// rayon n'est pas static, donc il appartient à un objet Cercle particulier.
	    // Une méthode static ne peut pas accéder directement à une variable d'instance.
	}
		
}