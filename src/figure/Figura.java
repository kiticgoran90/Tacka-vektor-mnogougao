package figure;

public abstract class Figura implements Imenovan, Cloneable {
	private String ime;
	
	public Figura(String ime) {
		this.ime = ime;
	}
	
	@Override
	public String ime() {return ime;}
	
	public Figura clone() {
		try {
			return (Figura)super.clone();
		}catch(CloneNotSupportedException g) {return null;}
	}
	
	public String toString() {
		return ime;
	}
}
