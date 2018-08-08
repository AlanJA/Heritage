package Film;

public class Comedie extends Cinema{

	String Titre;
	String Synopsis;
	boolean ComedieMusicale;
	boolean ComedieFamiliale;
	public String getTitre() {
		return Titre;
	}
	public void setTitre(String titre) {
		Titre = titre;
	}
	public String getSynopsis() {
		return Synopsis;
	}
	public void setSynopsis(String synopsis) {
		Synopsis = synopsis;
	}
	public boolean isComedieMusicale() {
		return ComedieMusicale;
	}
	public void setComedieMusicale(boolean comedieMusicale) {
		ComedieMusicale = comedieMusicale;
	}
	public boolean isComedieFamiliale() {
		return ComedieFamiliale;
	}
	public void setComedieFamiliale(boolean comedieFamiliale) {
		ComedieFamiliale = comedieFamiliale;
	}
	
	
}
