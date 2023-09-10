package Abstract_Class_35;

public class City_Bank implements US_Bank, Brazil_Bank{

	@Override
	public void creadit() {
		
		System.out.println("CITY BANK Credit");
		
		
	}

	@Override
	public void debit() {
		
		System.out.println("CITY BANK Debit");
		
		
	}

	@Override
	public void transfer_money() {
		
		System.out.println("CITY BANK Transfer_money");
		
		
	}

	//own method
	
	public void education_loan() {
	  System.out.println("CITY BANK Education Loan");	
	}
	
	
	
	public void car_loan() {
	 System.out.println("CITY BANK Car_Loan");
	}

	@Override
	public void cashback() {
	
		
	}

	@Override
	public void voucher() {
		
	}
    }
