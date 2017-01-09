package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Plateau {
	Pion[][] tableau;

	public Plateau(Pion[][] tableau) {
		super();
		this.tableau = tableau;
	}

	public Plateau() {
		super();
		this.tableau = new Pion[3][3];
		ArrayList<Short> al = new ArrayList<>();
		for (short i = 0; i < 9; i++) {
			al.add(i);
		}
		Collections.shuffle(al);
		for (short x = 0; x < 3; x++) {
			for (short y = 0; y < 3; y++) {
				tableau[x][y] = new Pion(al.remove(0), x, y);
			}
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "";
		for (Pion[] pions : tableau) {
			for (Pion pion : pions) {
				str += pion + " ";
			}
			str += "\n";
		}
		return str;
	}

	public int toInt() {
		int n = 0, o = 1;
		for (Pion[] pions : tableau) {
			for (Pion pion : pions) {
				n += (o * pion.toShort());
				o *= 10;
			}
		}
		return n;
	}
	
	public ArrayList<Plateau> getEnfants() {
		Pion[][] out = tableau;
		ArrayList<Plateau> e = new ArrayList<>();
		for (short x = 0; x < 3; x++) {
			for (short y = 0; y < 3; y++) {
				if (tableau[x][y].getValeur() == 0) {
					if (x > 0) {
						Pion tr = out[x - 1][y];
						out[x - 1][y] = out[x][y];
						out[x][y] = tr;
						out[x - 1][y].actualiser((short) (x - 1), y);
						out[x][y].actualiser(x, y);

						Plateau p = new Plateau(out);
						e.add(p);
						out = tableau;
					}if (x < 2) {
						Pion tr = out[x + 1][y];
						out[x + 1][y] = out[x][y];
						out[x][y] = tr;
						out[x + 1][y].actualiser((short) (x + 1), y);
						out[x][y].actualiser(x, y);

						Plateau p = new Plateau(out);
						e.add(p);
						out = tableau;
					}if (y > 0) {
						Pion tr = out[x][y - 1];
						out[x][y - 1] = out[x][y];
						out[x][y] = tr;
						out[x][y - 1].actualiser(x,(short) (y - 1));
						out[x][y].actualiser(x, y);

						Plateau p = new Plateau(out);
						e.add(p);
						out = tableau;
					}if (y < 2) {
						Pion tr = out[x][y + 1];
						out[x][y + 1] = out[x][y];
						out[x][y] = tr;
						out[x][y + 1].actualiser(x,(short) (y + 1));
						out[x][y].actualiser(x, y);

						Plateau p = new Plateau(out);
						e.add(p);
						out = tableau;
					}
				}
			}
		}
		return e;
	}
}
