package bankAccountApp;

public class Saving extends Account{
	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
	

	public Saving(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxId = (int)(Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4)); 
	}
	
	
	public void showInfo() {
		System.out.println("Account Type: Savings");
		super.showInfo();
		System.out.println(
				"Your Saving Accounts Features" +
				"\n Safety Deposit Box Id:" + safetyDepositBoxId +
				"\n Safety Deposit Box key:" + safetyDepositBoxKey
				);
		
	}
	
}
