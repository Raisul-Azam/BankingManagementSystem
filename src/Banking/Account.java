package Banking;
import Banking.Account;
public class Account
{
	    private String accountId;
	    private double balance;

	    public Account(String accountId, double balance) {
	        this.accountId = accountId;
	        this.balance = balance;
	    }

	    public String getAccountId() {
	        return accountId;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;

	    }

	    public void withdraw(double amount) {
	        balance -= amount;
	        System.out.println("Withdrawal successful!");
	    }

	    public void transfer(Account receiver, double amount) {
	        balance -= amount;
	        receiver.deposit(amount);
	        System.out.println("Transfer Successful!");
	    }
}
