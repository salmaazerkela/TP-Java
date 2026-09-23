package fr.alkendi.salma;

public class Point {
	public double abs ;
	public double ord ;
	public String couleur ;
	
	public Point() {
		this.abs=0;
		this.ord=0;
		this.couleur="noir";
	}
	
	public Point(double abs,double ord) {
		this.abs=abs;
		this.ord=ord;
		
	}
	public void mon_etat() {
		System.out.println("("+abs+","+ord+")"+couleur);
	}
	public double distance (Point p) {
		return Math.sqrt(this.abs-p.abs)*(this.abs-p.abs)+(this.ord-p.ord)*(this.ord-p.ord);
	}
}

