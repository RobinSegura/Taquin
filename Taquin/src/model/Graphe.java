package model;

import java.util.ArrayList;
import java.util.TreeMap;

public class Graphe {
	TreeMap<Integer,Element> graphe;
	
	public void add(Plateau p) {
		// TODO Auto-generated method stub
		
	}
	
	public Graphe() {
		graphe = new TreeMap<Integer, Element>();
		Plateau p = new Plateau();
		Element e = new Element(0, p);
		graphe.put(e.getClef(), e);
		
		graphe.put(e.getPlateau().toInt(),e);
		ArrayList<Plateau> enfants = new ArrayList<>();
		for (Plateau plateau : graphe.get(graphe.firstKey()).getPlateau().getEnfants()) {
			enfants.add(plateau);
		}
		while(!graphe.containsKey(123456780)){
			for (Plateau plateau: enfants) {
				
			}
		}
	}
}
