package inheritance_abstract_interface;

public class Accountant extends AbstractEmployee {
	
	public Accountant(String firstName, String lastName) {
		super(firstName, lastName);
	}

	@Override
	public void pay() {
		System.out.println("Paying an Accountant");
	}
	
	
}
