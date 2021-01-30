
public class LaLigaJerseyStore extends JerseyStore {
	
	Jersey createJersey(String item) {
		if (item.equals("Barcelona")) {
			return new BarcelonaJersey();
		}
		
		else if (item.equals("Real Madrid")) {
			return new RealMadridJersey();
		}
		
		else if (item.equals("Atletico Madrid")) {
			return new AtleticoMadridJersey();
		}
		
		else return null;
	}

}
