package hhh;

import java.util.ArrayList;

public class ConvenientCard implements Payment {
	private String type;
	private IDCard idCard;
	private double balance;

	public ConvenientCard(IDCard iDCard) throws CannotCreateCard {
		if (iDCard.getAge() < 12) {
			throw new CannotCreateCard("No enough age");
		} else if (iDCard.getAge() <= 18) {
			this.type = "Student";
			this.idCard = iDCard;
			this.balance = 100.0;
		} else {
			this.type = "Adult";
			this.idCard = iDCard;
			this.balance = 100.0;
		}
	}

	public void setType(String cardType) {
		this.type = cardType;
	}

	public String getType() {
		return this.type;
	}

	@Override
	public boolean pay(double amount) {
		if (this.balance > 0.0) {
			this.balance += amount;
			return true;
		}
		return false;
	}

	@Override
	public double checkBalance() {
		return this.balance;
	}

	@Override
	public String toString() {
		return this.idCard.toString() + "," + this.type + "," + this.balance;
	}

	// public ArrayList<ConvenientCard> getAdultConvenientCards() {
	// ArrayList<ConvenientCard> AdultConvenientCards = new
	// ArrayList<>(getAdultConvenientCards());
	// }
}
