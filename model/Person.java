package model;

/**
 * Abstract base class representing a person in the system.
 */
public abstract class Person {
    private int personId;
    private String fullName;
    private String phone;

    public Person(int personId, String fullName, String phone) {
        this.personId = personId;
        this.fullName = fullName;
        this.phone = phone;
    }

    public int getPersonId() { return personId; }
    public void setPersonId(int personId) { this.personId = personId; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}