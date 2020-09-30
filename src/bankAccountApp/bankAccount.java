package bankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class bankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Account>accounts = new LinkedList<Account>();
		
		String file = "/Users/kohki/Downloads/NewBankAccounts.csv";
		List<String[]> newAccountHolder = utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolder) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			
			if(accountType.equals("Savings")) {
				accounts.add(new Saving(name, sSN, initDeposit));
				
			}else if(accountType.equals("Checking")) {
				accounts.add(new Saving(name, sSN, initDeposit));
				
			}else {
				System.out.println("Error reading account type");
			}
		}
		for(Account acc : accounts) {
			System.out.println("******************");
			acc.showInfo();
		}
	}
}
