
public class Ville {
	
	private String nom;
	private String pays;
	private int nbHabitants;
	private static int  nbInstance = 0;
	
	public Ville(String nom,String pays,int nbHabitants) {
		this.nom=nom;
		this.pays=pays;
		this.nbHabitants=nbHabitants;
		nbInstance ++;
			
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
		}
		
		public void display () {
			System.out.println(this.nom + " "+ this.pays+ " " + this.nbHabitants + "nombre d'instance" + nbInstance);
		}

		@Override
		public String toString() {
			return "Ville [nom=" + nom + ", pays=" + pays + ", nbHabitants=" + nbHabitants + "]";
		}
		
		
	
	

}
