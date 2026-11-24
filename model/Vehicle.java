package model;

interface Payable {
    double calculateTotalCost();
    boolean processPayment(double amount);
}

public abstract class Vehicle implements Payable {
    private int vehicleId;
    private String brand;
    private String model;
    private int year;
    private double basePrice;
    private boolean available;

    public Vehicle(int vehicleId, String brand, String model, int year, double basePrice) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
        this.available = true;
    }

    public int getVehicleId() { return vehicleId; }
    public void setVehicleId(int vehicleId) { this.vehicleId = vehicleId; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getBasePrice() { return basePrice; }
    public void setBasePrice(double basePrice) { this.basePrice = basePrice; }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ")";
    }
}