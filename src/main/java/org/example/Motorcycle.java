package org.example;

public class Motorcycle extends Vehicle{

    private int engineCapacity;
    public Motorcycle(int registerationNumber, String brand, int year,int engineCapacity) {
        super(registerationNumber, brand, year);
        this.engineCapacity=engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public double calculateRentalCost(int rentalPeriod) {

        return 50.0 * rentalPeriod;
    }


    @Override
    public  String toString(){
        return "Vehicle Details:" +
                "\nRegistration Number: " + registerationNumber +
                "\nBrand: " + brand +
                "\nYear: " + year +
                "\nEngineCapacity: " + engineCapacity;

    }
}
