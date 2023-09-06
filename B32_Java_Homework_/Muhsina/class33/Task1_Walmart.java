package class33;

public class Task1_Walmart extends Task1_SuperClass {

	public static void main(String[] args) {
		// Child class should have their own different Methods.
		
		
		Task1_Walmart ob5=new Task1_Walmart();
		
		ob5.add_to_cart();
		ob5.buy();
		ob5.walmart();
	}
	
	public void walmart() {
		
		System.out.println("walmart");
	}

}
