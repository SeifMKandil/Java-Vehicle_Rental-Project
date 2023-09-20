package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();
        Scanner input = new Scanner(System.in);

        Vehicle car = new Car(123, "Toyota", 2020, "Gasoline");
        Vehicle motorcycle = new Motorcycle(456, "Honda", 2019, 250);
        Vehicle bicycle = new Bike(789, "BMX", 2016);

        rentalSystem.addVehicle(car);
        rentalSystem.addVehicle(motorcycle);
        rentalSystem.addVehicle(bicycle);

        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Rent a vehicle");
            System.out.println("2. Return a vehicle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available vehicles for rent:");

                    for (Vehicle vehicle : rentalSystem.getAvailableVehicles()) {
                        System.out.println(vehicle);
                    }

                    System.out.print("Enter the Registration Id: ");
                    int registrationNum = input.nextInt();
                    System.out.print("Enter the Rental Period: ");
                    int rentalperiod = input.nextInt();

                    rentalSystem.rentVehicle(registrationNum, rentalperiod);

                    System.out.println("Rental complete!");
                    break;
                case 2:
                    System.out.print("Enter the Registration Id: ");
                    int returnRegistrationNum = input.nextInt();

                    rentalSystem.returnVehicle(returnRegistrationNum);

                    System.out.println("Return complete!");
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }

        System.out.println("The total revenue for today is: EGP" + rentalSystem.getTotalRev());
    }
}
