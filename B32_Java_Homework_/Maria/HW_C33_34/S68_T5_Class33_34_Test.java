package HW_C33_34;

public class S68_T5_Class33_34_Test {

	public static void main(String[] args) {
		
		
		// S68_T5_Class33_34_C1 c = new S68_T5_Class33_34_C2();    // Down Casting is not working
		
		S68_T5_Class33_34_C1 c=(S68_T5_Class33_34_C1)new S68_T5_Class33_34_C2();
		
		c.blue();
		c.green();
		c.orange();
		c.orange2();
		c.red();
		c.silver();
		c.white();
		c.white1();
		
		S68_T5_Class33_34_C3 a=(S68_T5_Class33_34_C3)new S68_T5_Class33_34_C4();
		a.orange();
		a.orange();
		
		S68_T5_Class33_34_C2 u=(S68_T5_Class33_34_C2)new S68_T5_Class33_34_C3();
		
		u.blue();
		u.orange2();
		u.white1();
		
		
		// . Create 2 object by top Casting and Convert the Objects ( Run and check if Java Allows it or not.
		
		S68_T5_Class33_34_C4 k=(S68_T5_Class33_34_C1)new S68_T5_Class33_34_C1();
		k.blue();
		k.red();
		
		S68_T5_Class33_34_C3 b=(S68_T5_Class33_34_C1)new S68_T5_Class33_34_C1();
		
		b.red();
		
		
		
	}

}
