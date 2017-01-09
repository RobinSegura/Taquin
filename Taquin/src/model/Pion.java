package model;

public class Pion {
	private short valeur;
	private short x,y;
	private short dist;
	
	public Pion(short valeur, short x, short y) {
		super();
		this.valeur = valeur;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+valeur;
	}
	
	public short toShort(){
		return valeur;
	}
	
	public void actualiser(short x, short y){
		this.x =x;
		this.y =y;
	}

	public short getValeur() {
		return valeur;
	}
}
