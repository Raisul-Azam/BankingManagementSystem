package Banking;

import java.util.*;

import Banking.Account;

public class BankTransaction {
    private Account account;
    private Account receiverAccount;
    private double amount;
    private String type;
    private Date transactionDate;

    public BankTransaction(Account account, Account receiverAccount, double amount, String type, Date transactionDate) {
        this.account = account;
        this.receiverAccount = receiverAccount;
        this.amount = amount;
        this.type = type;
        this.transactionDate = transactionDate;
    }

    public Account getAccount() {
        return account;
    }

    public Account getReceiverAccount() {
        return receiverAccount;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }
}
