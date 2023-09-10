package S56_Class_33Task_Polymarphism;

public class Test_Parent_Child {
	
	public static void main(String[]args) {
		
		Test_Parent_Child ob = new Test_Parent_Child();
		
		ob.b(0);
		ob.b(null);
		ob.b();
		
	}
		public void b() {
			System.out.println("Orange b");
		}
		
		public void b(int y) {
			System.out.println("Orahge 2");
		}
		
		public void b(String x) {
			System.out.println("Orange 3");
		}
	}
		


