package bankaccountapp;

public class Checking extends Account {
	//List properties specific to checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	//Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit){
		super(name, sSN, initDeposit);
		accountNumber = "2"+accountNumber;
		setDebitCard();
	}
	@Override
	public void setRate(){
		//System.out.println("Implement rate for checking");
		rate = getBaseRate() * .15;
		
	}
	//List any methods specific to the checking account
	private void setDebitCard(){
		debitCardNumber = (int)(Math.random()*Math.pow(10,12));
		debitCardPin = (int)(Math.random()*Math.pow(10,4));
	}
	public void showInfo(){
		System.out.println("Account Type: Checking");
		super.showInfo();
		System.out.println(
				"Your Checking account features"+
		"\nDebit Card Number: "+debitCardNumber + 
		"\nDebit Card Pin: "+ debitCardPin);
		
	}

}
