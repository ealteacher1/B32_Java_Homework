package global_interface;

public class GeckoDriver implements WebDriver {
// after implementing create constructor of GecokoDriver
	
	public GeckoDriver() {
		
		System.out.println("If this constructor will call, Firefoe browser will launch");
	}
	
	
	@Override
	public void get_url(String url) {
		System.out.println("If this method is called, provided url (input parameter) will open in Firefox browser");
		
	}

	@Override
	public void close() {
		System.out.println("If this method is called, fire fox current browser will be closed");
	
	}

	@Override
	public void quit() {
		System.out.println("If this method is called, all fire fox browsers window will be closed");
		
	}

}
