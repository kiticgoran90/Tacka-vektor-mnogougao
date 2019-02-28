package figure;

public class Vektor {
	private double x, y, z;
	
	public Vektor(double x, double y, double z) {
		this.x = x; this.y = y; this.z = z;
	}
	
	public Vektor(Vektor v) {
		x = v.x; y = v.y; z = v.z;
	}
	
	public Vektor dodaj(Vektor v) {
		x += v.x; y += v.y; z += v.z;
		return this;
	}
	
	public Vektor pomnozi(double s) {
		x *= s; y *= s; z *= s;
		return this;
	}
	
	public double intenzitet() {return Math.sqrt(x*x + y*y + z*z);}
	
	public String toString() {
		return "(" + x + "," + y + "," + z + ")";
	}
}
