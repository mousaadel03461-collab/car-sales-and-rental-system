package model;

/**
 * Represents a car available for daily rental.
 */
public class RentalCar extends Vehicle {
    private double dailyRate;
    private int rentalDays;

    public RentalCar(int vehicleId, String brand, String model, int year, double basePrice, double dailyRate, int rentalDays) {
        super(vehicleId, brand, model, year, basePrice);
        this.dailyRate = dailyRate;
        this.rentalDays = rentalDays;
    }

    public double getDailyRate() { return dailyRate; }
    public void setDailyRate(double dailyRate) { this.dailyRate = dailyRate; }

    public int getRentalDays() { return rentalDays; }
    public void setRentalDays(int rentalDays) { this.rentalDays = rentalDays; }

    @Override
    public double calculateTotalCost() {
        return dailyRate * rentalDays;
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