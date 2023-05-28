package hhh;

public class BankAccount implements Transfer, Payment {
    private int accountNumber;
    private double interestRate;
    private double balance;

    public BankAccount(int accountNumber, double interestRate) {
        this.accountNumber = accountNumber;
        this.interestRate = interestRate;
        this.balance = 50.0;
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

    @Override
    public double checkBalance() {
        return balance;
    }

    public void receiveTransfer(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return accountNumber + "," + interestRate + "," + balance;
    }

    @Override
    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
