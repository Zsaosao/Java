package hhh;

public class EWallet implements Payment, Transfer {
	private int phoneNumber;
	private double balance;

	public EWallet(int phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.balance = 0.0;
	}

	@Override
	public boolean transfer(double amount, Transfer to) {
		double transferAmount = amount + amount * transferFee;
		if (balance >= transferAmount) {
			balance -= transferAmount;
			if (to instanceof EWallet) {
				((EWallet) to).receiveTransfer(amount);
			} else {
				((BankAccount) to).receiveTransfer(amount);
			}

			return true;
		} else {
			return false;
		}
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void receiveTransfer(double amount) {
		balance += amount;
	}

	@Override
	public boolean pay(double amount) {
		if (amount > 0.0) {
			this.balance -= amount;
			return true;
		}
		return false;
	}

	@Override
	public double checkBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return this.phoneNumber + "," + this.balance;
	}

	// code here

	public void topUp(int amount) {
		this.balance += amount;
	}
}