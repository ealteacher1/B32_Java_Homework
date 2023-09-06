package class33;

public class Task1_PCRichard extends Task1_SuperClass {
	
	public static void main(String[] args) {
		// Child class should have their own different Methods.
		
		Task1_PCRichard ob3= new Task1_PCRichard ();
		ob3.add_to_cart();
		ob3.PCRichard();

	}
	
	public void PCRichard () {
		
		System.out.println("PCRichard");
	}


}
