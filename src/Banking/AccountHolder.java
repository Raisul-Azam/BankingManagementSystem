package Banking;

import java.util.*;

public class AccountHolder {
	 private String userId;
	 private String pin;
	 private String name;
	 private List<BankTransaction> transactionHistory;

	 public AccountHolder(String userId, String pin, String name) {
	      this.userId = userId;
	      this.pin = pin;
	      this.name = name;
	      this.transactionHistory = new ArrayList<>();
	 }
	    
	 public String getUserId() {
	     return userId;
	 }

	 public String getPin() {
	     return pin;
	 }

	 public String getName() {
	     return name;
	 }

	 public List<BankTransaction> getTransactionHistory() {
	     return transactionHistory;
	 }

	 public void addTransaction(BankTransaction transaction) {
	     transactionHistory.add(transaction);
	 }
}
