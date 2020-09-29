package bankAccountApp;

public abstract class Account implements InterestRate{
	//list common properties for savings and checking accounts
	private String name;
	private String sSN;
	private static int index = 10000;
	private double balance;
	protected String accountNumber;
	protected double rate;
	
	
	
	//constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
	this.name = name;
	this.sSN = sSN;
	balance = initDeposit;
	
	//set account number
	index ++;

	this.accountNumber = setAccountNumber();
	setRate();
	}
	public abstract void setRate();
	
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueId = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueId;
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
		printBalance();
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String towhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $" + amount + "to" + towhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}

	//list common methods
	public void showInfo() {
		System.out.println(
				"Name: " + name +
				"\nAccount Number:" + accountNumber +
				"\nBalance: " + balance +
				"\nRate: " + rate + "%"
				);
	}
	}

	

