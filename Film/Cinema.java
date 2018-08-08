package Film;

public class Cinema {
	// propriete partage par les sous classe
 String Nom;
 int Annee;
 String Production;
 boolean Couleur;
 int Note;
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}
public int getAnnee() {
	return Annee;
}
public void setAnnee(int annee) {
	Annee = annee;
}
public String getProduction() {
	return Production;
}
public void setProduction(String production) {
	Production = production;
}
public boolean isCouleur() {
	return Couleur;
}
public void setCouleur(boolean couleur) {
	Couleur = couleur;
}
public int getNote() {
	return Note;
}
public void setNote(int note) {
	Note = note;
}
 
}
