package model;

public class BankAccount {
    private String accountNumber;
    private double moneyInBank;

    public BankAccount(String accountNumber, double moneyInBank){
        this.accountNumber = accountNumber;
        this.moneyInBank = moneyInBank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getMoneyInBank() {
        return moneyInBank;
    }

    public void setMoneyInBank(double moneyInBank) {
        this.moneyInBank = moneyInBank;
    }

    @Override
    public String toString() {
        return accountNumber + " " + moneyInBank;
    }

}
