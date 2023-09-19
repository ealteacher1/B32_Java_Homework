package global_interface;

public class Safari implements WebDriver {
	// AGAIN CREATE CONSTRUCTOR
	
	public Safari() {
		
		System.out.println();
			
	}

	@Override
	public void get_url(String url) {
		
		System.out.println("If this method is called, Safari current url (input parameter) will open");
	}

	@Override
	public void close() {
		
	System.out.println("If this method is called, Safari current browser will be closed");
	}

	@Override
	public void quit() {
		System.out.println("If this method is called, Safari all browsers will be closed");
		
		
	}

}
