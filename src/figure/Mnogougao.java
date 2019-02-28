package figure;

import greske.GNapravljen;

public class Mnogougao extends Figura implements Pokretljiv {
	private Tacka[] nizTemena;
	private int n;
	
	public Mnogougao(String ime, int brTemena) {
		super(ime);
		nizTemena = new Tacka[brTemena];
	}
	
	public Mnogougao dodaj(Tacka teme) throws GNapravljen {
		if(n==nizTemena.length) throw new GNapravljen();
		nizTemena[n++] = teme;
		return this;
	}
	
	@Override
	public void pomeri(Vektor pomak) {
		for(int i=0; i<n; i++)
			nizTemena[i].pomeri(pomak);
	}
	
	@Override
	public Vektor polozaj() {
		Vektor teziste = new Vektor(0,0,0);
		for(int i=0; i<n; i++)
			teziste.dodaj(nizTemena[i].polozaj());
		return teziste.pomnozi(1./n);
	}
	
	public Mnogougao clone() {
		Mnogougao m = (Mnogougao)super.clone();
		m.nizTemena = nizTemena.clone();
		for(int i=0; i<n; i++)
			m.nizTemena[i] = (Tacka)nizTemena[i].clone();
		return m;
	}
	
	public String toString() {
		StringBuffer s = new StringBuffer(super.toString());
		s.append("[");
		for(int i=0; i<n; i++) {
			if(i>0) s.append(", ");
			s.append(nizTemena[i]);
		}
		return s.append("]").toString();
	}
}
