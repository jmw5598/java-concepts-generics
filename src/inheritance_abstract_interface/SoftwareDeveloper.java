package inheritance_abstract_interface;

public class SoftwareDeveloper extends AbstractEmployee {
	
	public SoftwareDeveloper(String firstName, String lastName) {
		super(firstName, lastName);
	}

	@Override
	public void pay() {
		System.out.println("Paying a Software Developer");
	}
	
}
