
public class Fraction {
	private int numerateur;
	private int denominateur;

	public Fraction(int numerateur, int denominateur) {
		this.numerateur = numerateur;
		this.denominateur = denominateur;
	}

	public int getNumerateur() {
		return numerateur;
	}

	public void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
	}

	public int getDenominateur() {
		return denominateur;
	}

	public void setDenominateur(int denominateur) {
		this.denominateur = denominateur;
	}

	@Override
	public String toString() {
		return "Fraction [numerateur=" + numerateur + ", denominateur=" + denominateur + "]";
	}

}
