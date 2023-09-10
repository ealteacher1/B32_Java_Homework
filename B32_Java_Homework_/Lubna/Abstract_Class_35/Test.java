package Abstract_Class_35;

public class Test extends Shape{
	
	Test (){
		System.out.println("Test class constructor");
	}

	public static void main(String[] args) {
		
     Shape s = new Test();
     
     s.drawing();
     s.fill();
	}

	@Override
	void drawing() {
	
	System.out.println("This is Drwaing Abstract");	
	}
     
}
