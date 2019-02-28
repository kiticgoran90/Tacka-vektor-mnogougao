package figure;

public class Tacka implements Pokretljiv, Imenovan, Cloneable {
	private char ime;
	private Vektor polozaj;
	
	public Tacka(char ime, Vektor p) {
		this.ime = ime; polozaj = p;
	}
	
	@Override
	public String ime() {return Character.toString(ime);}
	
	@Override
	public void pomeri(Vektor pomak) {
		polozaj.dodaj(pomak);
	}
	
	@Override
	public Vektor polozaj() {return polozaj;}
	
	public Tacka clone() {
		try{
			Tacka t = (Tacka)super.clone();
			t.polozaj = new Vektor(polozaj);
			return t;
		}catch(CloneNotSupportedException g) {return null;}
	}
	
	public String toString() {
		return ime() + polozaj;
	}
}
