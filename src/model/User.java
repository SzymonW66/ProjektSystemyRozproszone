package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public  class User  {
    private String firstName;
    private String lastName;
    private String pesel;

    public User(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
//dodac hasło + login
        //przy przelewie wybierać jaki numer konta
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

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + pesel ;
    }

    private List<BankAccount> listOfAccountsOfThisUser = new ArrayList<>();

    void addNewBankAccount (BankAccount bankAccount) {
        listOfAccountsOfThisUser.add(bankAccount);
    }


}



