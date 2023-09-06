package class33;


public class Task1_Amazon extends Task1_SuperClass {

	public static void main(String[] args) {
		// Child class should have their own different Methods.
		
		Task1_Amazon ob1=new Task1_Amazon();
		ob1.amazon(0);
		ob1.amazon();
		ob1.amazon();

	}
	public void amazon() {
		
		System.out.println("this is amazon");
	}
	public void amazon(int a) {
		System.out.println("this is amazon with imput parameter");
		
	}

}
