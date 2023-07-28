package oopp;

public class User {
    private String id = "";
    private String fistName;
    private String lastName;
    private String phoneNumber;

    public User(String id, String fistName, String lastName, String phoneNumber) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    public User(String fistName, String lastName, String phoneNumber) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("* Contact: %s\nName: %s,\nSurname: %s,\nPhone Number: %s",
                id, fistName, lastName, phoneNumber);
    }
}