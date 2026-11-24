package model;

public class SaleCar extends Vehicle {
    private double taxRate;
    private int warrantyYears;

    public SaleCar(int vehicleId, String brand, String model, int year, double basePrice, double taxRate, int warrantyYears) {
        super(vehicleId, brand, model, year, basePrice);
        this.taxRate = taxRate;
        this.warrantyYears = warrantyYears;
    }

    public double getTaxRate() { return taxRate; }
    public void setTaxRate(double taxRate) { this.taxRate = taxRate; }

    public int getWarrantyYears() { return warrantyYears; }
    public void setWarrantyYears(int warrantyYears) { this.warrantyYears = warrantyYears; }

    @Override
    public double calculateTotalCost() {
        return getBasePrice() + (getBasePrice() * taxRate);
    }

    @Override
    public boolean processPayment(double amount) {
        if (amount >= calculateTotalCost()) {
            setAvailable(false);
            return true;
        }
        return false;
    }
}