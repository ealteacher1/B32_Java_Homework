package Abstract_Class_35;

public class Test_Bank {

	public static void main(String[] args) {
		
   // US_Bank ob = new US_Bank();
    
    City_Bank CB = new City_Bank();
    
    
    CB.creadit();
    CB.debit();
    CB.car_loan();
    CB.transfer_money();
    CB.education_loan();
    
    
    US_Bank ub = new City_Bank();
    
    ub.creadit();
    ub.debit();
    ub.transfer_money();
    
    //System.out.println(US_Bank.min_balance);
   // US_Bank.min_balance = 200;
	}
     
}
