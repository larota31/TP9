
public class Capital extends Ville {
	private String monument;
	private int nbInstance=0;
	
	public Capital(String nomVille,String nomPays,int nbHabitants, String nomMonument) {
		super (nomVille,nomPays,nbHabitants);
		this.monument=nomMonument;
		nbInstance ++;
		
	}

	@Override
	public String toString() {
		return "Capital [monument=" + monument + ", nbInstance=" + nbInstance + "]"+ super.toString();
	}
}
