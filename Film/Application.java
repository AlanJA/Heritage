package Film;

public class Application {


	
	public static void main(String[] args) {
		
		Horreur monFilm = new Horreur();
		monFilm.setTitre(" IT ");
		monFilm.setSynopsis(" Clown tueur ");
		monFilm.setRestrictionAge ( 16 );
		System.out.println(" Mon film est : "+ monFilm.getTitre() + " le resumer est : " + monFilm.getSynopsis()+ " est interdit au moin de : " + monFilm.RestrictionAge);
		
		ScienceFiction monFilm2 = new ScienceFiction();
		monFilm2.setTitre(" Star Wars ");
		monFilm2.setGenre(" Space Opéra ");
		monFilm2.setSynopsis("Rebelle vs Empire");
		monFilm2.setSpaceOpera(true);
		System.out.println(" Mon film est : "+ monFilm2.getTitre() + " le resumer est : " + monFilm2.getSynopsis()+ " de genre : " + monFilm2.getGenre());

		
		Comedie monFilm3 = new Comedie();
		monFilm3.setTitre(" LoL ");
		monFilm3.setSynopsis("tres LoL");
		monFilm3.setComedieFamiliale(true);
		monFilm3.setComedieMusicale(false);
		System.out.println(" Mon film est : "+ monFilm3.getTitre() + " le resumer est : " + monFilm3.getSynopsis()+ " est une comedie familiale ");

	}

}
