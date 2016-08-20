package inheritance_abstract_interface;

public class BusinessAnalyst extends AbstractEmployee {
	
	public BusinessAnalyst(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	@Override
	public void pay() {
		System.out.println("Paying a Business Analyst");
	}

}
