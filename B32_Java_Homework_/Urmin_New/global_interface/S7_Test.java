package global_interface;

public class S7_Test {
	
	Abc_1 dva;//interface global variable
	Abc_2 dvb;
	Abc_3 dvc;
	Abc_4 dvd;
	Abc_5 dve;
	
	A driver1;// global class variable
	B driver2;
	C driver3;

	public static void main(String[] args) {
		
		
		
	}
	
	public void values() {
		dva= new C();//interface value always child class object.
		dvb= new C(); //ctrl + space to see the child class
		dvc= new C();
		dvd= new C();
		dve= new C();
		
		driver1 = new A(5);
		driver2 = new B("Hello");
		driver3 = new C();
		
	}

}
