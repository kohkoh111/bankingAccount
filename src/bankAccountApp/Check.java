package bankAccountApp;

public class Check extends Account {
	//list properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	
	//Constructors to initialize checking account properties
	public Check(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	//list any methods specific to the checking account
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random() * Math.pow(10, 12)); 
		debitCardPin = (int)(Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features" +
				"\n Debit Card Number: " + debitCardNumber +
				"\n Debit Card PIN: " + debitCardPin 
				);
	}

}
