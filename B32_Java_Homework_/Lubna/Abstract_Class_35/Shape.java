package Abstract_Class_35;

public abstract class Shape {
	
	Shape (){
		 System.out.println("Shape class constructor");
	}
	
	int color;
	
	//Abstract method with abstract keyword:
	
	abstract void drawing();
	
	//non_Abstract method
	
	public void fill () {
		
		System.out.println("shape class fill method");
	}

}
