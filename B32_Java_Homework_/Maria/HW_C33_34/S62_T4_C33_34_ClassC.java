package HW_C33_34;

public class S62_T4_C33_34_ClassC extends S62_T4_C33_34_ClassB {

	public static void main(String[] args) {
		S62_T4_C33_34_ClassA ob = new S62_T4_C33_34_ClassC();
		
	}

	public void C() {
		System.out.println("this is form Grandchild C ");
	}
	
	S62_T4_C33_34_ClassC(){
	System.out.println("this is form Grandchild C default ");	
	}
	S62_T4_C33_34_ClassC(int a)
	{
		System.out.println("this is form Grandchild C modified ");
	}
}
