
public class PremierLeagueJerseyStore extends JerseyStore {
	
	Jersey createJersey(String item) {
		if (item.equals("Manchester City")) {
			return new ManchesterCityJersey();
		}
		
		else if (item.equals("Liverpool")) {
			return new LiverpoolJersey();
		}
		
		else if (item.equals("Chelsea")) {
			return new ChelseaJersey();
		}
		
		else return null;
	}
}
