package workbook;

public class Account {
	private String account;
	private int balance;
	private double interestRate;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		return balance * interestRate / 100;
	}

	public void deposit(int money) {
		balance = balance + money;
	}

	public void withdraw(int money) {
		balance = balance - money;
	}
}
