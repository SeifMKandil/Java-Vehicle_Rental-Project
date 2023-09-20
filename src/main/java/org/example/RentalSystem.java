package org.example;

import java.util.ArrayList;
import java.util.List;

public class RentalSystem {

    private float totalRev;
    private List<Vehicle> availableVehicles = new ArrayList<>();
    private List<Vehicle> rentedVehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle){
        availableVehicles.add(vehicle);
    }


    public void rentVehicle(int registrationNumber, int rentalPeriod) {
        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getRegisterationNumber() == registrationNumber) {
                double rentalCost = vehicle.calculateRentalCost(rentalPeriod);
                totalRev += rentalCost;



                System.out.println("Rented Vehicle: " + vehicle);
                System.out.println("Rental Cost: EGP " + rentalCost);
                availableVehicles.remove(vehicle);
                rentedVehicles.add(vehicle);
                return;
            }
        }
        System.out.println("Vehicle with registration number " + registrationNumber + " is not available for rent.");
    }

    public void returnVehicle(int registrationNumber) {
        for (Vehicle vehicle : rentedVehicles) {
            if (vehicle.getRegisterationNumber() == registrationNumber) {
                System.out.println("Returned Vehicle: " + vehicle);
                availableVehicles.add(vehicle);
                rentedVehicles.remove(vehicle);
                return;
            }
        }
        System.out.println("Vehicle with registration number " + registrationNumber + " was not found in the rented vehicles list.");
    }

    public float getTotalRev() {
        return totalRev;
    }

    public List<Vehicle> getAvailableVehicles() {
        return availableVehicles;
    }
}
