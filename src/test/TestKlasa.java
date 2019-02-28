package test;

import figure.*;
import greske.*;

public class TestKlasa {

	public static void main(String[] args) {
		try {
			Mnogougao m1 = new Mnogougao("abc", 3);
			m1.dodaj(new Tacka('A', new Vektor(0,0,0)))
			  .dodaj(new Tacka('B', new Vektor(1,1,1)))
			  .dodaj(new Tacka('C', new Vektor(3,2,1)));
			Mnogougao m2 = m1.clone();
			m2.pomeri(new Vektor(1,2,3));
			System.out.println(m1 + " - " + m1.polozaj().intenzitet());
			System.out.println(m2 + " - " + m2.polozaj().intenzitet());
		}catch(GNapravljen g) {System.out.println(g);}
	}
}
