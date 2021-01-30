
public abstract class JerseyStore {
	
	abstract Jersey createJersey(String item);
	
	public Jersey orderJersey(String type) {
		Jersey jersey = createJersey(type);
		System.out.println("Making a " + jersey.getName());
		jersey.customizeJersey();
		jersey.foldJersey();
		jersey.packageJersey();
		jersey.shipJersey();
		return jersey;
	}
}
