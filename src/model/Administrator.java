package model;

public class Administrator {
private final String login = "adminf";
private final String password = "1q2w3e4r5t";
private final boolean isAdmin = true;
private final String name;
private final String lastName;


    public Administrator(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }


}
