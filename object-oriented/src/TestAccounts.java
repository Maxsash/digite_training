import com.digite.bank.AccountFactory;
import com.digite.bank.BalanceException;
import com.digite.bank.Bank;

public class TestAccounts {
	public static void main(String[] args) {
//		Accounts a1 = new Accounts("Steve Bobs", 100);
		//Create AccountFactory class for providing respective objects
		Bank c1 = AccountFactory.openAccount("Savings", "Polo");
		
//		c1.statement();
//		
		c1.deposit(1000);
		try {
			c1.withdraw(500);
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //For Developers to troubleshoot the problem
			System.out.println(e); //For logging to audit system behavior
			System.out.println(e.getMessage()); //For user information
		}
		c1.statement();
//		c1.withdraw(3000);
//		c1.withdraw(5000);
//		c1.deposit(2000);
//		c1.deposit(4000);
//		
//		c1.statement();
	}
}
