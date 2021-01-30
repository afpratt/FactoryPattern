
public class JerseyOrder {

	public static void main(String[] args) {
		JerseyStore premierLeagueStore = new PremierLeagueJerseyStore();
		JerseyStore laLigaStore = new LaLigaJerseyStore();
		
		Jersey jersey = premierLeagueStore.orderJersey("Manchester City");
		System.out.println("Alex ordered a " + jersey.getName() + ".\n");
		
		jersey = laLigaStore.orderJersey("Barcelona");
		System.out.println("Mark ordered a " + jersey.getName() + ".\n");

		jersey = premierLeagueStore.orderJersey("Liverpool");
		System.out.println("Alex ordered a " + jersey.getName() + ".\n");
		
		jersey = laLigaStore.orderJersey("Real Madrid");
		System.out.println("Mark ordered a " + jersey.getName() + ".\n");

		jersey = premierLeagueStore.orderJersey("Chelsea");
		System.out.println("Alex ordered a " + jersey.getName() + ".\n");
		
		jersey = laLigaStore.orderJersey("Atletico Madrid");
		System.out.println("Mark ordered a " + jersey.getName() + ".\n");

	}

}
