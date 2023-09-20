package org.example;

public class Bike extends Vehicle{
    public Bike(int registerationNumber, String brand, int year) {
        super(registerationNumber, brand, year);
    }

    @Override
    public double calculateRentalCost(int rentalPeriod) {
        return 20.0 * rentalPeriod;
    }

    @Override
    public  String toString(){
        return "Vehicle Details:" +
                "\nRegistration Number: " + registerationNumber +
                "\nBrand: " + brand +
                "\nYear: " + year;

    }

}
