package model;

import exception.CarNotAvailableException;
import java.time.LocalDate;

/**
 * Represents a completed sale or rental transaction linking a customer and a vehicle.
 */
public class Transaction {
    private int transactionId;
    private Customer customer;
    private Vehicle vehicle;
    private LocalDate date;
    private double totalAmount;

    public Transaction(int transactionId, Customer customer, Vehicle vehicle) throws CarNotAvailableException {
        if (!vehicle.isAvailable()) {
            throw new CarNotAvailableException("Vehicle " + vehicle.toString() + " is currently unavailable.");
        }
        this.transactionId = transactionId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.date = LocalDate.now();
        this.totalAmount = vehicle.calculateTotalCost();
    }

    public int getTransactionId() { return transactionId; }
    public Customer getCustomer() { return customer; }
    public Vehicle getVehicle() { return vehicle; }
    public LocalDate getDate() { return date; }
    public double getTotalAmount() { return totalAmount; }
}