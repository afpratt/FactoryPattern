import java.util.ArrayList;

public abstract class Jersey {
	String name;
	
	ArrayList<String> customizations = new ArrayList<String>();
	
	void customizeJersey() {
		System.out.println("Customizing " + name);
		for (String customization : customizations) {
			System.out.println(" " + customization);
		}
		
	}
	
	void foldJersey() {
		System.out.println("Neatly folding the jersey.");
	}
	
	void packageJersey() {
		System.out.println("Placing jersey in box to ship.");
	}
	
	void shipJersey() {
		System.out.println("Shipping jersey to customer.");
	}
	
	public String getName() {
		return name;
	}
	
}
