package model;

public class Customer extends Person {
    private String licenseNumber;

    public Customer(int personId, String fullName, String phone, String licenseNumber) {
        super(personId, fullName, phone);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }
}