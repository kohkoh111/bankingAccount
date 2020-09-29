package bankAccountApp;

import java.util.List;

public class bankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String file = "/Users/kohki/Downloads/NewBankAccounts.csv";
		List<String[]> newAccountHolder = utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolder) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			//System.out.println(name + " " + sSN + " " + accountType + " " + "$" + initDeposit);
			if(accountType.equals("Saving")) {
				System.out.println("Open a saving account");
			}else if(accountType.equals("Checking")) {
				System.out.println("Open a checking account");
			}else {
				System.out.println("Error reading account type");
			}
		}
		
		
		
	}

}
