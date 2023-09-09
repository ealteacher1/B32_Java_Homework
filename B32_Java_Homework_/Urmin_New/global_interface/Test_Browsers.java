package global_interface;

public class Test_Browsers {
	// now make WebDriver as Global variable
	
	static WebDriver driver;// first it will give you error then change it to static

	public static void main(String[] args) {
		
		driver= new GeckoDriver();
		driver.get_url("https://www.amazon.com");
		driver.close();
		driver.quit();
		
		Safari();// call Safari method here
	}
	public static void Safari() {
		driver= new Safari();
		driver.get_url("https://www.amazon.com");
		driver.close();
		driver.quit();
		
	}
}
