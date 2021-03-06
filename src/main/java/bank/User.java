package bank;

import java.util.ArrayList;

public class User {

    private final String firstName;
    private final String lastName;
    private String pesel;
    private String phoneNumber;
    private ArrayList<Account> userAccounts = new ArrayList<>();

    public User(String firstName, String lastName, String pesel, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.phoneNumber = phoneNumber;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getPesel() {
        return pesel;
    }

    void setPesel(String pesel) {
        this.pesel = pesel;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    void addAccount(Account account) {
        this.userAccounts.add(account);
    }

    ArrayList<Account> getUserAccounts() {
        return userAccounts;
    }

    void setUserAccounts(ArrayList<Account> userAccounts) {
        this.userAccounts = userAccounts;
    }

    @Override
    public String toString() {
        return "[" + firstName + " " + lastName + ", PESEL: " + pesel + ", phone number: " + phoneNumber + "]";
    }
}
