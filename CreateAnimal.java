
public class CreateAnimal {

	public static void main (String argv[]){
		
		
		Chien monChien =new Chien();
		monChien.setNom("Médor");
		monChien.setCouleur("Noir");
		System.out.println("Mon chien s'appelle "  + monChien.getNom()+ " et il fait " + monChien.aboie());
		
		
		Chien monChien2 =new Chien();
		monChien.setNom("Milou");
		monChien.setCouleur("Noir");
		System.out.println("Mon chien s'appelle " + monChien.getNom()+ " et il fait " + monChien.aboie());
		
		Chat monChat =new Chat();
		monChat.setNom("Felix");
		monChat.setCouleur("Noir");
		System.out.println("Mon chat s'appelle "+ monChat.getNom()+ " et il fait " + monChat.miaul());
		
		Chat monChat2 =new Chat();
		monChat.setNom("Duchesse");
		monChat.setCouleur("Noir");
		System.out.println("Mon chat s'appelle " + monChat.getNom()+ " et il fait " + monChat.miaul());
		
		
	}

}
