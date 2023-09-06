package class33;

public class S6_T2_Q1_C2 extends S6_T2_Q1_C1 {

	public static void main(String[] args) {
		
		
		S6_T2_Q1_C2 ob1= new S6_T2_Q1_C2();
		ob1.ns1();
		System.out.println("----------");
		ob1.method1(0, 0, 0);

	}
	
	public void method1 (int a, int b, int c) {	
		a=90;
		b=20;
		c=50;
		
		System.out.println(x+a+b+c);}
		
	
	@Override
	public void ns1() {
		
		System.out.println("This is C2");
		
	}

}
