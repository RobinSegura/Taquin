package model;


public class Element {
	int clefParent;
	boolean traité;
	Plateau p;

	public Element(int etatParent, Plateau p) {
		this.clefParent = etatParent;
		this.p = p;
		traité=false;
	}

	public Plateau getPlateau() {
		// TODO Auto-generated method stub
		return p;
	}
	
	public int getClefParent() {
		return clefParent;
	}
	
	public int getClef(){
		return p.toInt();
	}
}
