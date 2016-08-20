package inheritance_abstract_interface;

import java.util.LinkedList;
import java.util.List;

public class PayrollApplication {
	
	public static void main(String[] args) {
		
		List<AbstractEmployee> list = new LinkedList<>();
		list.add(new Accountant("Argentine", "Ellington"));
		list.add(new BusinessAnalyst("Ressie", "Consolini"));
		list.add(new Accountant("Ana", "Beer"));
		list.add(new SoftwareDeveloper("Alton", "Orick"));
		list.add(new SoftwareDeveloper("Maynard", "Sitton"));
		
		for(AbstractEmployee e : list) {
			pay(e);
		}
		
		
	}
	
	public static void pay(Payable payable) {
		payable.pay();
	}
	
}
