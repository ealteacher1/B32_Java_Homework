package HW_C33_34;

public class S62_T4_C33_34_ClassB extends S62_T4_C33_34_ClassA {

	public static void main(String[] args) {
		 S62_T4_C33_34_ClassA ob = new  S62_T4_C33_34_ClassB();
		 
		
	}
    public void B() {
    	System.out.println("method B from B class");
    }
	
	
	S62_T4_C33_34_ClassB(){
		System.out.println("constructor default class B");
	}
	
	S62_T4_C33_34_ClassB(int a){
	System.out.println("constructor modified class B");	
	}
	
	
	
	
}
