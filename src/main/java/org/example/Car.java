package org.example;

public class Car extends Vehicle{
    private String fuelType;
    public Car(int registerationNumber, String brand, int year,String fuelType) {
        super(registerationNumber, brand, year);
        this.fuelType=fuelType;
    }

    @Override
    public double calculateRentalCost(int rentalPeriod) {
        return 100.0 * rentalPeriod;
    }

    @Override
    public  String toString(){
        return "Vehicle Details:" +
                "\nRegistration Number: " + registerationNumber +
                "\nBrand: " + brand +
                "\nYear: " + year +
                "\nFuelType: " + fuelType;
    }


}
