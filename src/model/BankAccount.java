package model;

public class BankAccount {
    private String accountNumber;
    private String moneyInBank;
    private String pin;

    public BankAccount(String accountNumber, String moneyInBank, String pin){
        this.accountNumber = accountNumber;
        this.moneyInBank = moneyInBank;
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMoneyInBank() {
        return moneyInBank;
    }

    public void setMoneyInBank(String moneyInBank) {
        this.moneyInBank = moneyInBank;
    }

    @Override
    public String toString() {
        return accountNumber + " " + moneyInBank;
    }

}


