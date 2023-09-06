package class34;

public class Class34_task7_MainMethod implements Class34_task7_Interface_5, Class34_task7_Interface_4,
Class34_task7_Interface_3,Class34_task7_Interface_2, Class34_task7_Interface_1  {

	/*Task :
        1. create 5 interfaces and every interface will have it's own different abstract method.
        2. create a normal java class without main method and make it child of all 5interfaces directly 
        with implements keyword*/
	
	
	
	public static void main(String[] args) {
		

	}

	@Override
	public void method5() {


		System.out.println("method 5 from main method");
	}

	@Override
	public void method1() {


		System.out.println("method 1 from main method");
		
	}

	@Override
	public void method2() {


		System.out.println("method 2 from main method");
		
	}

	@Override
	public void method3() {


		System.out.println("method 3 from main method");
		
	}

	@Override
	public void method4() {


		System.out.println("method 4 from main method");
		
	}
	
	public static void NS6() {
		
		System.out.println("static method 6 from main method");
		
	}
	
       public void NS3() {
    	   
    	   System.out.println("non static method 3 from main method");
		
	}

}
