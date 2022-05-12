package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public  class User  {
    private String firstName;
    private String lastName;
    private String pesel;
    private String login;
    private String password;


    public User(String firstName, String lastName, String pesel, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.login  = login;
        this.password = password;

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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



