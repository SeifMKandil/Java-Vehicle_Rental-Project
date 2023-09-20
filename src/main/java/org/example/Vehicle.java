package org.example;

 abstract class Vehicle {
    final int registerationNumber;
    final String brand;
    final int year;


    public Vehicle(int registerationNumber , String brand , int year){
        this.brand = brand;
        this.registerationNumber = registerationNumber;
        this.year = year;
    }

    public int getRegisterationNumber() {
        return registerationNumber;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public abstract double calculateRentalCost(int rentalPeriod);

    @Override
    public abstract String toString();
}
