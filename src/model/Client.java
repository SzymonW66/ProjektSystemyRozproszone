package model;

public class Client {
    private String firstName;
    private String lastName;
    private String pesel;
    private BankAccount bankAccount;

    public Client(String firstName, String lastName, String pesel, BankAccount bankAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.bankAccount = bankAccount;
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

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + pesel + " " + bankAccount.toString();
    }

}
