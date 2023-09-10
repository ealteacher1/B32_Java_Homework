package Class_35_Task_5;

public class TestClass {

	public static void main(String[] args) {
		
		//Down Casting
		
		C_1 c1 = (C_1) new C_2();
		c1.C_1();
		c1.C_2();
		c1.C_3();
		c1.C_4();
		
		C_3 c3 = (C_3) new C_4();
		c3.C_3();
		c3.C_4();
		
		C_2 c2 = (C_2)new C_3();
		c2.C_2();
		c2.C_3();
		c2.C_4();
		
	
		//Create 2 object by top casting and convert the objects ( run and check if java allows it or not
		
		C_4 c4 =(C_1) new C_1();
		c4.C_4();
		
		
		C_3 ob= (C_1)new  C_1();
		
		ob.C_3();
		ob.C_4();
		
		

	}

}
