package Film;

public class ScienceFiction extends Cinema{
	
	String Titre;
	String Synopsis;
	String genre;
	boolean SpaceOpera;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public boolean isSpaceOpera() {
		return SpaceOpera;
	}
	public void setSpaceOpera(boolean spaceOpera) {
		SpaceOpera = spaceOpera;
	}

	
	
	
	
	

	
}
