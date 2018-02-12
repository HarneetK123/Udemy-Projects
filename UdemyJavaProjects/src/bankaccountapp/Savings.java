package bankaccountapp;

public class Savings extends Account {
	//List properties specific to savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	//Constructor to initialize savings account properties
	public Savings(String name, String sSN, double initDeposit){
		super(name, sSN,initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	private void setSafetyDepositBox(){
		safetyDepositBoxID = (int)(Math.random()*Math.pow(10,3));
		safetyDepositBoxKey = (int)(Math.random()*Math.pow(10,4));
	}
		
	//List any methods specific to the savings account
	public void showInfo(){
		System.out.println("Account Type: Savings");
		super.showInfo();
		System.out.println(
				"Your Saving account features"+
		"\nSafety Deposit Box ID: "+safetyDepositBoxID + 
		"\nSafety Deposit Box Key: "+ safetyDepositBoxKey);
		
			
	}

	@Override
	public void setRate() {
		//System.out.println("Implement rate in savings");
		rate = getBaseRate() - .25;
		
	}

	
	}



