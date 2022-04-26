package model;

public class Client {
    private String firstName;
    private String lastName;
    private String pesel;
    private String accountNumber;
    private double moneyInBank;

    public Client(String firstName, String lastName, String pesel, String accountNumber, double moneyInBank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.accountNumber = accountNumber;
        this.moneyInBank = moneyInBank;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
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
        return firstName + " " + lastName + " " + pesel + " " + accountNumber + " " + moneyInBank;
    }

}
